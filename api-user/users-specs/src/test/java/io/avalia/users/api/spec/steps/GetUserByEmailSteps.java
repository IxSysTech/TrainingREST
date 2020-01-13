package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.dto.User;
import io.avalia.users.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class GetUserByEmailSteps {

    private String userEmail;

    public GetUserByEmailSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have an existing user email$")
    public void i_have_an_existing_user_email(){
        this.userEmail = "david.simeonovic@heig-vd.ch";
    }

    @Given("^I have a none existing user email$")
    public void i_have_a_none_existing_user_email(){
        this.userEmail = "davud.simeonovic@heig-vd.ch";
    }

    @When("^I GET it to the /user/email endpoint$")
    public void i_GET_it_to_the_user_email_endpoint() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getUserByEmailWithHttpInfo(userEmail);
            ParentSteps.lastApiCallThrewException = false;
            ParentSteps.lastApiException = null;
            ParentSteps.lastStatusCode = ParentSteps.lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            ParentSteps.lastApiResponse = null;
            ParentSteps.lastApiCallThrewException = true;
            ParentSteps.lastApiException = e;
            ParentSteps.lastStatusCode = ParentSteps.lastApiException.getCode();
        }
    }

}
