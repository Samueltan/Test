package io;

import java.io.*;
import java.util.Properties;

/**
 * Created by Samuel on 2014/12/7.
 */
public class PropertiesFile {
    public static void main(String[] argc){
        try {
            String value;
            InputStream fis = new FileInputStream("cmd.properties");
            Properties prop = new Properties();
            prop.load(fis);

            int cmdValue = 0;
            switch (cmdValue){
                case 0:
                    System.out.println("************** 20 **************");
                    value = prop.getProperty("mode");
                    System.out.println("************** 201 ************** value = " + value);


                    if(value.equalsIgnoreCase("auto"))
                        prop.setProperty("mode", "manual");
                    if(value.equalsIgnoreCase("manual"))
                        prop.setProperty("mode", "auto");
                    break;
                default:
                    break;
            }

            System.out.println("************** 24 **************");
            // Save the properties
            OutputStream fos = new FileOutputStream("cmd.properties");
            prop.store(fos, "save command value");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO error occurred.");
        }
    }
}
