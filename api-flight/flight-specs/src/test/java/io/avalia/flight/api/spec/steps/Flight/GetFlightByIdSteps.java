package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class GetFlightByIdSteps {
    private int flightId;

    public GetFlightByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }


    @Given("^I have an existing flight id$")
    public void iHaveAnExistingFlightId() {
        this.flightId = 1;
    }

    @Given("^I have a none existing flight id$")
    public void iHaveANoneExistingFlightId() {
        this.flightId = 0;
    }

    @When("^I POST it to the /flight/id endpoint$")
    public void i_POST_it_to_the_flight_id_endpoint() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getFlightByIdWithHttpInfo(flightId);
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
