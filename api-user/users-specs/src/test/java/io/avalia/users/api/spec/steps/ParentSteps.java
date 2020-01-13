package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.spec.helpers.Environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParentSteps {
    public static ApiResponse lastApiResponse;
    public static ApiException lastApiException;
    public static boolean lastApiCallThrewException;
    public static int lastStatusCode;

    public static Environment environment;
    public static DefaultApi api;


    public ParentSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }


    @Given("^there a User API server$")
    public void there_is_a_User_API_server() throws Throwable {
        assertNotNull(api);
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }
}
