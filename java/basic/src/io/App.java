package io;

/**
 * Created by Samuel on 2014/12/7.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("C:/temp/cmd.properties"));

            System.out.println(prop.getProperty("speed"));
            System.out.println(prop.getProperty("steering"));
            System.out.println(prop.getProperty("dbpassword"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}