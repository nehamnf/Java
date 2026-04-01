package com.banking.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Database configuration and connection pool management for the Banking Application.
 * 
 * This class provides a centralized way to manage database connections using HikariCP,
 * a high-performance JDBC connection pool. It handles connection pool initialization,
 * configuration, and provides methods to obtain connections and shut down the pool gracefully.
 * 
 * The configuration is loaded from application.properties and can be overridden by
 * environment variables for different deployment environments.
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class DatabaseConfig {
    /** Logger for database operations and error tracking */
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);
    
    /** HikariCP data source for managing database connections */
    private static HikariDataSource dataSource;

    /**
     * Private constructor to prevent instantiation of this utility class.
     * This class is designed to be used statically.
     */
    private DatabaseConfig(){
    }

    /**
     * Static initialization block that initializes the connection pool
     * when the class is loaded. This ensures the pool is ready before
     * any database operations are attempted.
     */
    static {
        initializePool();
    }

    /**
     * Initializes the HikariCP connection pool with configuration from properties.
     * 
     * This method sets up the connection pool with optimal settings for the banking
     * application, including connection limits, timeouts, and performance tuning.
     * The pool is configured to handle concurrent database operations efficiently.
     * 
     * @throws RuntimeException if the pool initialization fails
     */
    public static void initializePool(){
        try{
            // Create HikariConfig and load database connection settings
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(PropertiesLoader.get("db.url"));
            config.setUsername(PropertiesLoader.get("db.username"));
            config.setPassword(PropertiesLoader.get("db.password"));
            
            // Set pool size limits
            config.setMaximumPoolSize(PropertiesLoader.getInteger("db.maximumPoolSize"));
            config.setMinimumIdle(2);
            
            // Set timeout and lifecycle settings
            config.setConnectionTimeout(30000); // 30 seconds
            config.setIdleTimeout(600000);      // 10 minutes
            config.setMaxLifetime(1800000);     // 30 minutes
            
            // Set connection validation and pool name
            config.setConnectionTestQuery("SELECT 1");
            config.setPoolName("BankingAppPool");
            
            // Create and initialize the data source
            dataSource = new HikariDataSource(config);
            logger.info("✅ Database connection pool initialized successfully");
        }catch (Exception e){
            logger.error("❌ Failed to initialize database connection pool",e);
            throw new RuntimeException("Failed to initialize database connection pool",e);
        }
    }

    /**
     * Retrieves a database connection from the connection pool.
     * 
     * This method provides a connection from the HikariCP pool. The connection
     * should be properly closed after use to return it to the pool.
     * 
     * @return A database connection from the pool
     * @throws SQLException if unable to obtain a connection from the pool
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * Gracefully shuts down the database connection pool.
     * 
     * This method should be called during application shutdown to ensure
     * all connections are properly closed and resources are released.
     * It's safe to call this method multiple times.
     */
    public static void shutDown(){
        if (dataSource != null && !dataSource.isClosed()){
            dataSource.close();
            logger.info("✅ Database connection pool shut down successfully");
        }
    }
}
