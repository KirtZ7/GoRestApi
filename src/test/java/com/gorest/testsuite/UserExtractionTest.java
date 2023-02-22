package com.gorest.testsuite;

import com.gorest.testbase.TestBaseUser;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class UserExtractionTest {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        response = given()
                .when()
                .get("/public/v2/users?page=1&per_page=20")
                .then().statusCode(200);
    }

    //1. Extract All Ids
    @Test
    public void test01() {
        List<HashMap<?,?>> test = response.extract().path("Data");
        System.out.println(test);
        int size = test.size();
        System.out.println(size);
    }
    //2. Extract the all Names
    //3. Extract the name of 5th object
    //4. Extract the names of all object whose status = inactive
    //5. Extract the gender of all the object whose status = active
    //6. Print the names of the object whose gender = female
    //7. Get all the emails of the object where status = inactive
    //8. Get the ids of the object where gender = male
    //9. Get all the status
    //10. Get email of the object where name = Karthik Dubashi IV
    //11. Get gender of id = 5471
}
