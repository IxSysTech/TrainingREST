package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Flight;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class DeleteFlightByIdSteps {
    private int flightId;

    public DeleteFlightByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have a invalid flight id$")
    public void iHaveAInvalidFlightId() {
        flightId = 0;
    }

    @When("^I DELETE it to the /flight endpoint$")
    public void iDELETEItToTheFlightEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.deleteFlightByIdWithHttpInfo(flightId);
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
