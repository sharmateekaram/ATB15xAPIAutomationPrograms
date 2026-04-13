package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.annotations.Test;

public class APITesting_TestNGInvocationCount {

    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }

    @Test(invocationCount = 2, enabled = false)
    public void test03(){
        System.out.println("3");
    }

    @Test(invocationCount = 3, alwaysRun = true)
    public void test04(){
        System.out.println("4");
    }

}
