package n11project.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1-Create the properties object
    private static Properties properties = new Properties();

    static {
        try {
            //2-We need to open the file in java memory:FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3-Lad the properties object using FileInputStream object
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Something happened in the ConfigurationReader class");
        }

    }

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);
    }

}
