package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static Properties initialize_Properties(){
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return getProperties();
    }
    public static Properties getProperties() {

        return properties;
    }
}