package config;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

public class getProperties {
    String resources = "hyun.properties";
    Properties properties = new Properties();
	public getProperties(){

    }  
	public String get_svPubkey() {
        try {

            properties.load(new getProperties().getClass().getResourceAsStream(resources));

        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("svPubkey");
	}
	public String get_myPubkey() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resources));

        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("myPubkey");
	}
	public String get_myPrikey() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resources));

        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("myPrikey");
	}

}
