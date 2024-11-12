package com.listener;

import Utility.ExtentManager;
import Utility.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listening implements ITestListener {

    public void onTestStart(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName());

        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is pass");

        ExtentTestManager.getTest().log(Status.PASS,"Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is failed");

        ExtentTestManager.getTest().log(Status.FAIL,"Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        // not implemented
        System.out.println("Running the Test Method Name :- " + result.getMethod().getMethodName() + "Test is Skipped");

        ExtentTestManager.getTest().log(Status.SKIP,"Test Skipped");
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

        ExtentTestManager.endTest();
        ExtentManager.getInstance().flush();
    }

}
