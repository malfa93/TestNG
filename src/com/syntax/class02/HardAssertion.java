package com.syntax.class02;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion extends CommonMethods {



    @Test
    public void validationOfTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaagement System";

        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement username = driver.findElement(By.id("txtUsername"));

        Assert.assertTrue(username.isDisplayed());
        System.out.println("Hello");

//        if(expectedTitle.equalsIgnoreCase(actualTitle)){
//            System.out.println("Test Passed");
//        }else{
//            System.out.println("Test Failed");
//        }
    }

    //Post condition @AfterMethod - close browser

}
