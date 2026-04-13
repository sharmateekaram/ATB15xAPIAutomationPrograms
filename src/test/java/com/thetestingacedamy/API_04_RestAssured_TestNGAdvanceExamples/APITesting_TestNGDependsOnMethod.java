package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_TestNGDependsOnMethod {

    //interview
    //Hard Dependency (Default): All prerequisite methods must succeed.
    //              If any dependency fails, the following tests are skipped.
    //Soft Dependency: Achieved by setting alwaysRun=true. The test will still execute
    //              even if some of its dependencies fail, but it will still follow the specified order.

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }


    @Test(dependsOnMethods = "serverStartedOk", alwaysRun = true)   //Soft Dependency
    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "test3")           //Hard Dependency
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);

    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test3() {
        System.out.println("method3");
        Assert.assertTrue(true);

    }
}
