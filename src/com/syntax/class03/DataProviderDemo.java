package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo {

    WebDriver driver;


    @DataProvider
    public Object[][] data(){
        Object[][] login = new Object[4][2];

        login[0][0]= "Admin";
        login[0][1]= "Hum@nhrm123";
        login[1][0]= "Admin";
        login[1][1]= "Hum@nhrm123";
        login[2][0]= "Admin";
        login[2][1]= "Hum@nhrm123";
        login[3][0]= "Admin";
        login[3][1]= "Hum@nhrm123";

        return login;



    }

    @BeforeMethod
    public void openBrowserAndLaunchApplication(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    //@Test - perform login

    @Test(groups = "regression", dataProvider = "data")
    public void adminLogin(String username, String password){
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

    }


    @Test
    public void validationOfTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";

        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }

    //Post condition @AfterMethod - close browser

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
