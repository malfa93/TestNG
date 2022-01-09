package com.syntax.class03;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest extends CommonMethods {

    //@Test - perform login



    @Test(groups = "regression", enabled = true)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

    }


    @Test(groups = "regression")
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



}
