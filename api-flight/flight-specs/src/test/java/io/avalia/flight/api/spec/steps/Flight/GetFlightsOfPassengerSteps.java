package io.avalia.flight.api.spec.steps.Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class GetFlightsOfPassengerSteps {
    private int passengerId;

    public GetFlightsOfPassengerSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have an existing passenger id$")
    public void i_have_an_existing_passenger_id() {
        this.passengerId = 1;
    }

    @Given("^I have a none existing passenger id$")
    public void iHaveANoneExistingPassengerId() {
        this.passengerId = 0;
    }

    @When("^I POST it to the /flight/passenger endpoint$")
    public void iPOSTItToTheFlightPassengerEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.getFlightsOfPassengerWithHttpInfo(passengerId);
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
