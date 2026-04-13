package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.annotations.Test;

public class APITesting_TestNGPriority {

//
//    method : test_t4 and priority = -1
//    method : test_t5 and priority = 0
//    method : test_t2 and priority = 1
//    method : test_t131 and priority = 2
//    method : test_t3 and priority = 2
//    method : test_t31 and priority = 2
//    method : test_t1 and priority = 3
//


    @Test(priority = 3)
    public void test_t1() {
        System.out.println("method : test_t1 and priority = 3");
    }

    @Test(priority = -1) // -1,-100, -2 == 0
    public void test_t4() {
        System.out.println("method : test_t4 and priority = -1");
    }

    @Test(priority = 1)
    public void test_t2() {
        System.out.println("method : test_t2 and priority = 1");
    }

    @Test(priority = 2)
    public void test_t3() {
        System.out.println("method : test_t3 and priority = 2");
    }

    @Test(priority = 2)
    public void test_t31() {
        System.out.println("method : test_t31 and priority = 2");
    }
    @Test(priority = 2)
    public void test_t131() {
        System.out.println("method : test_t131 and priority = 2");
    }

    @Test(priority = 0)
    public void test_t5() {
        System.out.println("method : test_t5 and priority = 0");
    }



}
