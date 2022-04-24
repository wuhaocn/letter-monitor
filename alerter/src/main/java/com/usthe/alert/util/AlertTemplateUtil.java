package com.usthe.alert.util;


import com.usthe.alert.service.impl.AlertServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 告警模版关键字匹配替换引擎工具
 * @author tom
 * @date 2021/12/10 11:53
 */

public class AlertTemplateUtil {

    /**
     * 匹配 ${key} 的变量
     * eg: Alert, the instance: ${instance} metrics: ${metrics} is over flow.
     */
    private static final Pattern PATTERN = Pattern.compile("\\$\\{(\\w+)\\}");

    private static final Logger log = LoggerFactory.getLogger(AlertTemplateUtil.class);


    public static String render(String template, Map<String, Object> replaceData) {
        try {
            Matcher matcher = PATTERN.matcher(template);
            StringBuffer buffer = new StringBuffer();
            while (matcher.find()) {
                Object objectValue = replaceData.getOrDefault(matcher.group(1), "NullValue");
                String value = objectValue.toString();
                matcher.appendReplacement(buffer, value);
            }
            matcher.appendTail(buffer);
            return buffer.toString();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return template;
        }
    }
}
