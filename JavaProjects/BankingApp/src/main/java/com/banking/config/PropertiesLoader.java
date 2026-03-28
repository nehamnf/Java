package com.banking.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private static final Properties properties = new Properties();

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

    public static  String get(String key){
        String envValue = System.getenv(key.replace(".","_").toUpperCase());
        if (envValue != null && !envValue.isBlank()){
            return envValue;
        }
        String value = properties.getProperty(key);
        if( value  == null ||  !value.isBlank()){
            throw new RuntimeException("Missing Required config key: "+key);
        }
        return value;
    }

    public static int getInteger(String key){
        return Integer.parseInt(get(key));
    }
}
