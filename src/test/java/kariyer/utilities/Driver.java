package kariyer.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            String browserType = ConfigurationReader.getProperty("browser");
            /*
                configuration.properties dosyasından internet tarayıcı tipini okuyor,
                switch yöntemiyle talep edilen tarayıcıyı açıyor.
            */
            switch (browserType){
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
            }
        }

        return driver;
    }


    /*   quit() metoduyla işlem bittiğinde tarayıcıyı kapatıyor.
     */
    public static void closeDriver(){
        if (driver != null){
            driver.quit();
        }
    }


}