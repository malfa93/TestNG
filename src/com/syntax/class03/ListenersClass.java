package com.syntax.class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting the execution with the name: "+result.getHost());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Taking the screenshot of the test having the name:"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed the execution with the name: "+result.getHost());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped the execution with the name: "+result.getHost());
    }

}
