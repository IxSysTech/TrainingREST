package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class GetFlightsSteps {
    private int number;
    private int size;

    public GetFlightsSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^Given I have a page size and number$")
    public void iHaveAnExistingFlightId() {
        this.number = 0;
        this.size = 10;
    }

    @When("^I GET it to the /flight endpoint$")
    public void iGETItToTheFlightEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getFlightsWithHttpInfo(number, size);
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
