package com.usthe.alert.dto;

/**
 * Number of monitoring level alarms 监控级别告警数量
 *
 * @author tom
 * @date 2022/3/6 19:52
 */
public class AlertPriorityNum {

    /**
     * Alarm level 告警级别
     */
    private byte priority;

    /**
     * count 数量
     */
    private long num;

    public AlertPriorityNum(byte priority, long num) {
        this.priority = priority;
        this.num = num;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }
}
