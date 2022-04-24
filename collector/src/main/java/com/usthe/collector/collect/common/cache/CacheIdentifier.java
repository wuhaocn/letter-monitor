package com.usthe.collector.collect.common.cache;

/**
 * 缓存key唯一标识符
 * @author tomsun28
 * @date 2021/12/1 21:30
 */
public class CacheIdentifier {

    private String ip;

    private String port;

    private String username;

    private String password;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
