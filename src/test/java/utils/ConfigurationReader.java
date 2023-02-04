package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {//we need to surrand try-catch with { } or will give error bc try-catch should be always used inside another code
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close(); //close the file after you load it, save memory
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Searches for the property with the specified key in this property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns null if the property is not found.
     * @param key
     * @return the value in this property list with the specified key value.
     */

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}


