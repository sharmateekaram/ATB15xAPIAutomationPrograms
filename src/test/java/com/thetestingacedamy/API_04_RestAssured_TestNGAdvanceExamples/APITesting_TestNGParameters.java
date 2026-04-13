package com.thetestingacedamy.API_04_RestAssured_TestNGAdvanceExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_TestNGParameters {


    //interview -  if testng.XML contains  like  below than latest one which is firefox will get value
    //        <parameter name="browser" value="chrome"></parameter>
    //        <parameter name="browser" value="firefox"></parameter>

    @Parameters("browser")
    @Test
    public void demo1(String value) {
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome!");
        }

    }

}
