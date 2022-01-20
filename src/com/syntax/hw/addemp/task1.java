package com.syntax.hw.addemp;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class task1 extends CommonMethods {

    @Test
    public void login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();

        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Mohammed");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("Alfadhli");




    }

}
