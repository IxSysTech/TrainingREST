package io.avalia.flight.api.spec.steps.Passenger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Passenger;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class GetPassengerByIdSteps {

    public GetPassengerByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @When("^I GET it to the /passenger/id endpoint$")
    public void iGETItToThePassengerIdEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getPassengerByIdWithHttpInfo(ParentSteps.passengerId);
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
