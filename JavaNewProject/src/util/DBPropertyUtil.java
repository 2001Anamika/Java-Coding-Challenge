package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class DBPropertyUtil{

    public static String getConnectionString(String fileName) {
        try {
            Properties properties = loadProperties(fileName);

            // Assuming the property key for the connection string is "connectionString"
            String connectionString = properties.getProperty("connectionString");

            if (connectionString != null) {
                return connectionString;
            } else {
                throw new RuntimeException("Connection string not found in the properties file.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file: " + e.getMessage(), e);
        }
    }
    private static Properties loadProperties(String fileName) throws IOException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            properties.load(fis);
        }
        return properties;
    }
}
