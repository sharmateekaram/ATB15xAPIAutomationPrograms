package com.thetestingacedamy.API_03_RestAssured_CRED.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_GET_NonBDDStyle {

    RequestSpecification reqSpe;
    Response response;
    ValidatableResponse vr;
    String pincode;


    @Test
    public  void getMethod(){
        pincode = "110048";
        System.out.println("========1===========");
        reqSpe = RestAssured.given();
        reqSpe.baseUri("https://api.zippopotam.us");
        reqSpe.basePath("/IN/" + pincode);

        response = reqSpe.when().log().all().get();
        System.out.println("=========2==========");
        //In REST Assured, .asString() is a method used to extract the entire response body as a single Java String
        System.out.println(response.asString());
        System.out.println("========3===========");
        System.out.println(response.toString());
        System.out.println("==========4=========");

        vr = response.then().log().all().statusCode(200);


    }

}
