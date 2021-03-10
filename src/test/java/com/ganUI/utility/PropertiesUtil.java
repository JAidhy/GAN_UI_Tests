package com.ganUI.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

//This class is used for reading the config.properties file
public class PropertiesUtil {
    private static PropertiesUtil instance;
    private final Properties properties = new Properties();

    private PropertiesUtil() {

        loadProperties();
    }

    public static PropertiesUtil getInstance() {
        if (instance == null) {
            instance = new PropertiesUtil();
        }
        return instance;
    }

    public String getWebURL() {
        return properties.getProperty("webURl");
    }

    public String getBrowser() {
        return properties.getProperty("browserName");
    }

    private void loadProperties() {
        try {
            InputStream iStream = new FileInputStream("src/test/resources/properties/config.properties");
            properties.load(iStream);
        } catch (Exception exception) {
            Logger.getLogger(PropertiesUtil.class.getName()).log(Level.SEVERE, "config file not found", exception);
        }
    }


}

