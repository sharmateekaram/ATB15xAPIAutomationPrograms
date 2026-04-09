package com.thetestingacedamy.API_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Log_RA {


    @Test
    public void test_RA1_NoLog(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping").when().get().then().statusCode(201);

    }

    @Test
    public void test_RA1_GivenLog(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping").log().all().when().get().then().statusCode(201);

    }
    @Test
    public void test_RA1_thenLog(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping").when().get().then().statusCode(201).log().all();

    }

    @Test
    public void test_RA_Bothlog(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping").log().all().when().get().then().statusCode(201).log().all();
    }

}
