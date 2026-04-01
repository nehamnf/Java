package com.banking.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utility class for loading and managing application configuration properties.
 * 
 * This class provides a centralized way to access configuration values from
 * application.properties file. It supports environment variable overrides,
 * allowing for flexible configuration across different deployment environments.
 * 
 * Configuration lookup order:
 * 1. Environment variables (with dots replaced by underscores and converted to uppercase)
 * 2. Properties file (application.properties)
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class PropertiesLoader {
    /** Properties object to hold configuration values from application.properties */
    private static final Properties properties = new Properties();

    /**
     * Static initialization block that loads properties from application.properties.
     * 
     * This block is executed when the class is loaded and attempts to read the
     * application.properties file from the classpath. If the file is not found
     * or cannot be loaded, a RuntimeException is thrown.
     */
    static {
        try(InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream("application.properties")){
            if ( input == null){
                throw new RuntimeException("application.properties not found in the classpath");
            }
            properties.load(input);
        }catch (IOException e){
            throw new RuntimeException("Failed to load the application.properties",e);
        }
    }

    /**
     * Retrieves a configuration property value.
     * 
     * This method first checks for an environment variable override, then falls back
     * to the properties file. Environment variables are checked by converting the
     * key to uppercase and replacing dots with underscores.
     * 
     * Examples:
     * - "db.url" becomes environment variable "DB_URL"
     * - "db.username" becomes environment variable "DB_USERNAME"
     * 
     * @param key The configuration key to look up
     * @return The configuration value
     * @throws RuntimeException if the key is not found in either environment variables or properties file
     */
    public static  String get(String key){
        // First, check for environment variable override
        String envValue = System.getenv(key.replace(".","_").toUpperCase());
        if (envValue != null && !envValue.isBlank()){
            return envValue;
        }
        
        // Fall back to properties file
        String value = properties.getProperty(key);
        if( value  == null ||  !value.isBlank()){
            throw new RuntimeException("Missing Required config key: "+key);
        }
        return value;
    }

    /**
     * Retrieves a configuration property value as an integer.
     * 
     * This method uses the same lookup order as get() but parses the result
     * as an integer. It's useful for numeric configuration values like
     * connection pool sizes, timeouts, etc.
     * 
     * @param key The configuration key to look up
     * @return The configuration value parsed as an integer
     * @throws RuntimeException if the key is not found or cannot be parsed as an integer
     * @throws NumberFormatException if the value cannot be converted to an integer
     */
    public static int getInteger(String key){
        return Integer.parseInt(get(key));
    }
}
