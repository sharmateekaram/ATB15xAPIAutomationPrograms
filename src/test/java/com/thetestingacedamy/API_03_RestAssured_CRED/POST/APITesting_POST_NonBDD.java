package com.thetestingacedamy.API_03_RestAssured_CRED.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_POST_NonBDD {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String payload ;

    @Test
    public void postMethod(){
        payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("=========Given===requestSpecification======");
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();

        System.out.println("=========When===response======");
        response = requestSpecification.when().log().all().post();

        System.out.println("=========Then===validatableResponse======");
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);





    }



}
