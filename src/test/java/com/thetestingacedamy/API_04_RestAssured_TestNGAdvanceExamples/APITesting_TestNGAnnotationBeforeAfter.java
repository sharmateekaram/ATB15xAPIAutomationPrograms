package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.annotations.*;

public class APITesting_TestNGAnnotationBeforeAfter {

//    BeforeSuite
//    BeforeTest
//    BeforeClass
//    BeforeMethod
//    Test
//    AfterMethod
//    AfterClass
//    AfterTest
//    AfterSuite

    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }

    @BeforeSuite
    void demo1()
    {
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }



}
