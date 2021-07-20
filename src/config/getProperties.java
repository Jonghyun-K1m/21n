
package config;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;



public class getProperties {
    String resource = "jdbc.properties";
    Properties properties = new Properties();
	public getProperties(){

    }  
	public String get_driver() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resource));
       //    System.out.println(properties.getProperty("driver"));
       //    System.out.println(properties.getProperty("user"));
       //     System.out.println(properties.getProperty("password"));
       //     System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("driver");
	}
	public String get_url() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resource));
       //    System.out.println(properties.getProperty("driver"));
       //    System.out.println(properties.getProperty("user"));
       //     System.out.println(properties.getProperty("password"));
       //     System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("url");
	}
	public String get_dbuser() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resource));
       //    System.out.println(properties.getProperty("driver"));
       //    System.out.println(properties.getProperty("user"));
       //     System.out.println(properties.getProperty("password"));
       //     System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("user");
	}
	public String get_dbpwd() {
        try {
        	properties.load(new getProperties().getClass().getResourceAsStream(resource));
       //    System.out.println(properties.getProperty("driver"));
       //    System.out.println(properties.getProperty("user"));
       //     System.out.println(properties.getProperty("password"));
       //     System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		return properties.getProperty("password");
	}
	
	
	/*
	public static void main(String[] args) {
        String resource = "jdbc.properties";
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
    } */
}
