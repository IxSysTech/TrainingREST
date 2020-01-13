package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.api.spec.helpers.Environment;

public class GetUsersSteps {

    private int number;
    private int size;


    public GetUsersSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }


    @Given("^I have a page size and number$")
    public void i_have_a_page_size_and_number(){
        this.number = 0;
        this.size = 10;
    }

    @When("^I GET it to the /user endpoint$")
    public void i_GET_it_to_the_user_endpoint() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getUsersWithHttpInfo(number, size);
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
