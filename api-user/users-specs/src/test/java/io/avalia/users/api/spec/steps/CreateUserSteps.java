package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.api.dto.User;
import io.avalia.users.api.spec.helpers.Environment;

import java.util.Random;

public class CreateUserSteps {
    private User user;

    public CreateUserSteps(Environment environment){
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
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
            ParentSteps.lastApiResponse = ParentSteps.api.createUserWithHttpInfo("david.simeonovic@heig-vd.ch","password", user);
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

    @When("^I POST it to the /user endpoint with a none admin user$")
    public void i_POST_it_to_the_users_endpoint_with_a_none_admin_user() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.createUserWithHttpInfo("fake@john.dos","Passwürd", user);
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
