package com.syntax.class02;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println("I am login test");
    }

    @Test(dependsOnMethods = "login")
    public void verificationOfDashboard(){
        System.out.println("I'm a dependant scenario");
    }

}
