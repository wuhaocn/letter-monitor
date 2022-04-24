package com.usthe.collector.collect.common.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

/**
 * @author tomsun28
 * @date 2022/1/1 21:24
 */
public class JdbcConnect implements CacheCloseable {

    private static final Logger log = LoggerFactory.getLogger(String.class);

    private Connection connection;

    public JdbcConnect(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            log.error("close jdbc connect error: {}", e.getMessage());
        }
    }

    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public Connection getConnection() {
        return connection;
    }
}
