package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

    private static Properties PAGE_PROPERTIES;
    private static String[] PROP_FILES = new String[] { "pages.properties", "settings.properties" };

    /**
     * Load the pages.properties file
     */
    static {
        // load property file
        Properties appProperties = new Properties();

        for (int i = 0; i != PROP_FILES.length; i++) {
            try {
                String propFile = PROP_FILES[i];
                Properties prop = new Properties();
                InputStream input = PropertiesUtils.class.getClassLoader().getResourceAsStream(propFile);
                prop.load(input);
                appProperties.putAll(prop);
            } catch(FileNotFoundException e){
                //TODO: Log the error accordingly
                e.printStackTrace();
            } catch(IOException e){
                //TODO: Log the error accordingly
                e.printStackTrace();
            }
        }

        PAGE_PROPERTIES = appProperties;
    }

    public static String get(String propertyName) {
        return PAGE_PROPERTIES.getProperty(propertyName);
    }
}
