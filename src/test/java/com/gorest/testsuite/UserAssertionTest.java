package com.gorest.testsuite;

import com.gorest.testbase.TestBaseUser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserAssertionTest {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        response = given()
                .when()
                .get("/public/v2/users?page=1&per_page=20")
                .then().statusCode(200);
    }

    //1. Verify if the total record is 20


    //2. Verify the if the name of id = 5487 is equal to ”Hamsini Trivedi”
    @Test
    public void test02(){
    }

    //3. Check the single ‘Name’ in the Array list (Subhashini Talwar)
    //4. Check the multiple ‘Names’ in the ArrayList (Mrs. Menaka Bharadwaj, Msgr. BodhanGuha, Karthik Dubashi IV)
    //5. Verify the emai of userid = 5471 is equal “adiga_aanjaneya_rep@jast.org”
    //6. Verify the status is “Active” of username is “Shanti Bhat V”
    //7. Verify the Gender = male of username is “Niro Prajapat”
}
