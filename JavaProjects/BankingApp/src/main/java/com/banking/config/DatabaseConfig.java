package com.banking.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);
    private static HikariDataSource dataSource;

    private DatabaseConfig(){
    }

    static {
        initializePool();
    }

    public static void initializePool(){
        try{
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(PropertiesLoader.get("db.url"));
            config.setUsername(PropertiesLoader.get("db.username"));
            config.setPassword(PropertiesLoader.get("db.password"));
            config.setMaximumPoolSize(PropertiesLoader.getInteger("db.maximumPoolSize"));
            config.setMinimumIdle(2);
            config.setConnectionTimeout(30000);
            config.setIdleTimeout(600000);
            config.setMaxLifetime(1800000);
            config.setConnectionTestQuery("SELECT 1");
            config.setPoolName("BankingAppPool");
            dataSource = new HikariDataSource(config);
            logger.info("✅ Database connection pool initialized successfully");
        }catch (Exception e){
            logger.error("❌ Failed to initialize database connection pool",e);
            throw new RuntimeException("Failed to initialize database connection pool",e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void shutDown(){
        if (dataSource != null && !dataSource.isClosed()){
            dataSource.close();
            logger.info("✅ Database connection pool shut down successfully");
        }
    }
}
