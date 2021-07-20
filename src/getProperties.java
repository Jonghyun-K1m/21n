

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;
public class getProperties {
    public static void main(String[] args) {
        String resource = "config/jdbc.properties";
        Properties properties = new Properties();
        
        try {
         //   Reader reader = Resources.getResourceAsReader(resource);
            //InputStream readerr = user.class.getResourceAsStream(resource);
           // properties.load(readerr);
        	properties.load(new getProperties().getClass().getResourceAsStream(resource));
            System.out.println(properties.getProperty("driver"));
            System.out.println(properties.getProperty("user"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
