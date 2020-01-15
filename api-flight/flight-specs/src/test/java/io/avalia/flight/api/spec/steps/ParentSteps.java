package io.avalia.flight.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.avalia.flight.ApiException;
import io.avalia.flight.ApiResponse;
import io.avalia.flight.api.DefaultApi;
import io.avalia.flight.api.spec.helpers.Environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParentSteps {
    public static ApiResponse lastApiResponse;
    public static ApiException lastApiException;
    public static boolean lastApiCallThrewException;
    public static int lastStatusCode;

    public static Environment environment;
    public static DefaultApi api;

    public static int passengerId;

    public ParentSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }


    @Given("^there a User API server$")
    public void there_is_a_User_API_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have an existing passenger id$")
    public void i_have_an_existing_passenger_id() {
        this.passengerId = 1;
    }

    @Given("^I have a none existing passenger id$")
    public void iHaveANoneExistingPassengerId() {
        this.passengerId = 0;
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }
}
