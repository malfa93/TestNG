package com.syntax.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreconditionAndPostCondition {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I'm precondition");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I'm post condition");
    }

    @Test
    public void test(){
        System.out.println("I'm actual test");
    }

    @Test
    public void anotherTest(){
        System.out.println("I am another test");
    }
}
