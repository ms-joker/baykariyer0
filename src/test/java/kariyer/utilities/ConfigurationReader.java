package kariyer.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // Properties obje oluşturur.
    private static final Properties properties = new Properties();

    static{

        try {

            // java hafizasındaki: FileInputStream dosyasını açacak.
            FileInputStream file = new FileInputStream("configuration.properties");

            // FileInputStream objesiyle properties yükleniyor
            properties.load(file);

            // sonra dosya kapatılır.
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}