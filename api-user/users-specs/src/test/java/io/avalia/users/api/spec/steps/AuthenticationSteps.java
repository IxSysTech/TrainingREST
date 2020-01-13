package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.JSON;
import io.avalia.users.api.spec.helpers.Environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AuthenticationSteps {
    private String email;
    private String password;
    private String token;

    public AuthenticationSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have an existing user email and password$")
    public void i_have_an_existing_user_email_and_password(){
        this.email = "david.simeonovic@heig-vd.ch";
        this.password = "password";
    }


    @Given("^I have a none existing user email and password$")
    public void i_have_a_none_existing_user_email_and_password(){
        this.email = "davud.simeonovic@heig-vd.ch";
        this.password = "password";
    }

    @When("^I POST it to the /user/authentication endpoint$")
    public void i_POST_it_to_the_user_authentication_endpoint() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.authenticationWithHttpInfo(email, password);
            ParentSteps.lastApiCallThrewException = false;
            ParentSteps.lastApiException = null;
            ParentSteps.lastStatusCode = ParentSteps.lastApiResponse.getStatusCode();
            token = ParentSteps.lastApiResponse.getData().toString();
        } catch (ApiException e) {
            ParentSteps.lastApiResponse = null;
            ParentSteps.lastApiCallThrewException = true;
            ParentSteps.lastApiException = e;
            ParentSteps.lastStatusCode = ParentSteps.lastApiException.getCode();
        }
    }

    @Then("^I receive a (\\d+) status code and a token$")
    public void i_receive_a_status_code_and_a_token(int arg1) throws Throwable {
        assertEquals(arg1, ParentSteps.lastStatusCode);
        assertNotNull(token);
    }
}
