package com.syntax.class02;

import org.testng.annotations.*;

public class BeforeSuiteAndBeforeTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I'm before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I'm after Suite");
    }

    @BeforeTest
    public void beforeTest
            (){
        System.out.println("I'm before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I'm after Test");
    }

    @Test(groups = "regression")
    public void regressionTest(){
        System.out.println("I'm a regression Test");
    }

    @Test(groups = "smoke")
    public void smokeTest(){
        System.out.println("I'm a smoke Test");
    }



}
