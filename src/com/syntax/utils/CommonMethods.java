package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public static void openBrowserAndLaunchApplication(){

        ConfigReader.readProperties("/Users/mohammedalfadhli/IdeaProjects/TestNgBasicsBatch11/src/com/syntax/config/config.properties");
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecho.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }


        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
