package com.thetestingacedamy.API_03_RestAssured_CRED.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_PATCH_NonBDD {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String payload ;

    @Test
    public void patchMethod(){
        String token = "dfab68198d1cd12";
        String bookingid = "564";

        payload = "{\n" +
                "    \"firstname\": \"Rohit\",\n" +
                "    \"lastname\": \"Sharma\"\n" +
                "}";

        System.out.println("=========Given===requestSpecification======");
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingid);

        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookies("token", token);
        requestSpecification.body(payload).log().all();

        System.out.println("=========When===response======");
        response = requestSpecification.when().log().all().patch();

        System.out.println("=========Then===validatableResponse======");
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);





    }



}
