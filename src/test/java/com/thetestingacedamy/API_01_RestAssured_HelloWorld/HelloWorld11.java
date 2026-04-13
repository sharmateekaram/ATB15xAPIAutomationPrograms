package com.thetestingacedamy.API_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWorld11 {

    @Test
    public void testHelloWorld(){

        // Rest Assured
        // Given
        // When
        // Then
        RestAssured
                // Step 1- re- Req
                .given()
                .basePath("/ping")
                .baseUri("https://restful-booker.herokuapp.com")

                // Step 2- Action
                .when()
                .get()
                // Step 3- Validation
                .then()
                .statusCode(201);

    }
}
