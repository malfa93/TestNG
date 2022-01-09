package com.syntax.class01;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {


    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I an after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am the before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am the after method");
    }

    @Test
    public void firstTest(){
        System.out.println("I am the first test");
    }

    @Test
    public void secondTest(){
        System.out.println("I am the second test");
    }

    @Test
    public void thirdTest(){
        System.out.println("I am the third test");
    }
}
