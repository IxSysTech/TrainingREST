package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Flight;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class UpdateFlightByIdSteps {
    Flight flight;
    int flightId;

    public UpdateFlightByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
        flight = new Flight();
    }

    @Given("^I have a invalid flight payload and id$")
    public void iHaveAInvalidFlightPayloadAndId() {
        flightId = 0;
        flight.setId(0);
        flight.setStart("Début");
        flight.setEnd("Fin");
        flight.setTime("120");
    }

    @When("^I PUT it to the /flight endpoint$")
    public void iPUTItToTheFlightEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.updateFlightByIdWithHttpInfo(flightId,flight);
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
