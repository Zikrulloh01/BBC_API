package com.bbc_api.step_definitions;

import com.bbc_api.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class api_steps {

    Response response;
    JsonPath jsonPath;
    Map<String, Object> conversion_rates;


    @When("Go to api endpoint")
    public void go_to_api_endpoint() {
        response = given().accept(ContentType.JSON)
                .and()
                .when()
                .get(ConfigurationReader.get("url"));
    }

    @Then("Verify status code is {string}")
    public void verify_status_code_is(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), response.statusCode());
        System.out.println("Actual status code = " + response.statusCode());
    }

    @Then("Count number of currencies")
    public void count_number_of_currencies() {
        jsonPath = response.jsonPath();
         conversion_rates = jsonPath.get("conversion_rates");
        System.out.println("Count = " + conversion_rates.size());
    }

    @Then("Verify {string} exists in the list")
    public void verify_exists_in_the_list(String currencyType) {
        assertTrue(conversion_rates.containsKey(currencyType));
        System.out.println("GBP = " + conversion_rates.get("GBP"));
    }
}
