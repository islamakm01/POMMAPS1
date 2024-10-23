package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listening implements ITestListener {

    public void onTestStart(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is pass");
    }

    public void onTestFailure(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is failed");
    }

    public void onTestSkipped(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        // not implemented
        System.out.println("Test Suite:- " + context.getName());
    }

    public void onFinish(ITestContext context) {
        // not implemented

        System.out.println("Test Suite Ended and will remove all memory " + context.getName());
    }

}
