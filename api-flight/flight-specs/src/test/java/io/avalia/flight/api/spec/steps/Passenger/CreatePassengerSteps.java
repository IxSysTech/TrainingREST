package io.avalia.flight.api.spec.steps.Passenger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Passenger;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class CreatePassengerSteps {
    Passenger passenger;

    public CreatePassengerSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
        passenger = new Passenger();
    }

    @Given("^I have a valid passenger payload$")
    public void i_have_a_valid_passenger_payload() {
        passenger.setId(0);
        passenger.setFirstname("David");
        passenger.setLastname("Simeonovic");
    }

    @When("^I POST it to the /passenger endpoint$")
    public void iPOSTItToThePassengerEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.createPassengerWithHttpInfo(passenger);
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
