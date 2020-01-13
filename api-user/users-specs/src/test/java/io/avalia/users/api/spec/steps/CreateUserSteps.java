package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.dto.User;
import io.avalia.users.api.spec.helpers.Environment;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreateUserSteps {
    private Environment environment;
    private DefaultApi api;

    private User user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public CreateUserSteps(Environment environment){
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there a User API server$")
    public void there_is_a_User_API_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {
        user = new io.avalia.users.api.dto.User();
        user.setEmail("user" + new Random().nextInt(1000000000) + "@mail.com");
        user.setFirstname("John");
        user.setLastname("Doe");
        user.setPassword("test");
        user.setIsAdmin(0);
    }

    @When("^I POST it to the /user endpoint with an admin user$")
    public void i_POST_it_to_the_users_endpoint_with_an_admin_user() throws  Throwable {
        try{
            this.lastApiResponse = api.createUserWithHttpInfo("david.simeonovic@heig-vd.ch","password", user);
            this.lastApiCallThrewException = false;
            this.lastApiException = null;
            this.lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            this.lastApiResponse = null;
            this.lastApiCallThrewException = true;
            this.lastApiException = e;
            this.lastStatusCode = lastApiException.getCode();
        }
    }

    @When("^I POST it to the /user endpoint with a none admin user$")
    public void i_POST_it_to_the_users_endpoint_with_a_none_admin_user() throws  Throwable {
        try{
            this.lastApiResponse = api.createUserWithHttpInfo("fake@john.dos","Passwürd", user);
            this.lastApiCallThrewException = false;
            this.lastApiException = null;
            this.lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            this.lastApiResponse = null;
            this.lastApiCallThrewException = true;
            this.lastApiException = e;
            this.lastStatusCode = lastApiException.getCode();
        }
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }
}
