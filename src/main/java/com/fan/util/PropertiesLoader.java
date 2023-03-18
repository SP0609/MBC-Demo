package com.fan.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Utility class for loading properties file
 *
 * @author  Suman Puthran
 */
public class PropertiesLoader {
    /**
     * Loads the given properties file
     * @return
     */
    public static Properties loadProperties(){
        Properties properties = new Properties();
        try {
            InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream("fan.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
