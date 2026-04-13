package com.thetestingacedamy.API_03_RestAssured_CRED.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_GET_BDDStyle {

    @Test
    public  void test1(){
        String pincode = "110048";
              RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

}
