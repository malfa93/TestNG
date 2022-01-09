package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties readProperties(String filePath){

        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            try {
                prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return prop;
    }


    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }


}
