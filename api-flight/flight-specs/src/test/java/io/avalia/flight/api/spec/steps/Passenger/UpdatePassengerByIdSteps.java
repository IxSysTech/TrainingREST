package io.avalia.flight.api.spec.steps.Passenger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Flight;
import io.avalia.flight.api.dto.Passenger;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class UpdatePassengerByIdSteps {

    private int passengerId;
    Passenger passenger;

    public UpdatePassengerByIdSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
        passenger = new Passenger();
    }

    @Given("^I have a valid passenger payload and an invalid id$")
    public void iHaveAValidPassengerPayloadAndAnInvalidId() {
        passengerId = 0;
        passenger.setId(0);
        passenger.setFirstname("David");
        passenger.setLastname("Simeonovic");
    }

    @When("^I PUT it to the /passenger/id endpoint$")
    public void iPUTItToThePassengerIdEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.updatePassengerByIdWithHttpInfo(passengerId,passenger);
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
