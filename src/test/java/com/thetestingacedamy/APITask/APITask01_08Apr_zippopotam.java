package com.thetestingacedamy.APITask;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITask01_08Apr_zippopotam {

    @Test(description = "TC_Pos_01: Both  country + postal  are valid then returns correct data")
    public void TC_Pos_01(){
        String pincode = "110001";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test(description = "TC_Neg_01: Valid country + Invalid postal then returns 404")
    public void test_Negative_tc1(){
        String pincode = "123456";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_02: Valid country + Blank postal then returns 404")
    public void test_Negative_tc2(){
        String pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_03: Valid country + specialcharacter postal then returns 404")
    public void test_Negative_tc3(){
        String pincode = "@$#$";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }



    @Test(description = "TC_Neg_04: Valid country + alphanumeric postal then returns 404")
    public void test_Negative_tc4(){
        String pincode = "110048ANV";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_05: Valid country + only 000 postal then returns 404")
    public void test_Negative_tc5(){
        String pincode = "000000";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_06: Invalid country + valid postal then returns 404")
    public void test_Negative_tc6(){
        String pincode = "110048";
        String countryCode = "abc";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/"+countryCode+"/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_07: blank country + valid postal then returns 404")
    public void test_Negative_tc7(){
        String pincode = "110048";
        String countryCode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/"+countryCode+"/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_08: special character country + valid postal then returns 404")
    public void test_Negative_tc8(){
        String pincode = "110048";
        String countryCode = "!@#$";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/"+countryCode+"/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_09: aphanumeric character country + valid postal then returns 404")
    public void test_Negative_tc9(){
        String pincode = "110048";
        String countryCode = "Abc123";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/"+countryCode+"/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test(description = "TC_Neg_010: Invalid country + Invalid postal then returns 404")
    public void test_Negative_tc10(){
        String pincode = "118";
        String countryCode = "UKKK";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/"+countryCode+"/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }


}
