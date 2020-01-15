package io.avalia.flight.api.spec.steps.Passenger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class DeletePassengerByIdSteps {

    public DeletePassengerByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have a invalid passenger id$")
    public void iHaveAInvalidPassengerId() {
        ParentSteps.passengerId = 0;
    }

    @When("^I DELETE it to the /passenger/id endpoint$")
    public void iDELETEItToThePassengerIdEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.deleteFlightByIdWithHttpInfo(ParentSteps.passengerId);
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
