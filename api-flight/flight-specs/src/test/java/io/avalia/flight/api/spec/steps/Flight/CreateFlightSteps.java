package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Flight;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class CreateFlightSteps {
    Flight flight;

    public CreateFlightSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
        flight = new Flight();
    }

    @Given("^I have a valid flight payload$")
    public void i_have_a_valid_flight_payload() {
        flight.setId(0);
        flight.setStart("Début");
        flight.setEnd("Fin");
        flight.setTime("120");
    }

    @Given("^I have a invalid flight payload$")
    public void iHaveAInvalidFlightPayload() {
        flight.setStart("Début");
        flight.setEnd("Fin");
        flight.setTime("120");
    }

    @When("^I POST it to the /flight endpoint$")
    public void iPOSTItToTheFlightEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.createFlightWithHttpInfo(flight);
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
