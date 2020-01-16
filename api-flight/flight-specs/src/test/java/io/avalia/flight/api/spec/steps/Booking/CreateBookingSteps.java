package io.avalia.flight.api.spec.steps.Booking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.flight.ApiException;
import io.avalia.flight.api.dto.Booking;
import io.avalia.flight.api.dto.Passenger;
import io.avalia.flight.api.spec.helpers.Environment;
import io.avalia.flight.api.spec.steps.ParentSteps;

public class CreateBookingSteps {
    Booking booking;

    public CreateBookingSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
        booking = new Booking();
    }

    @Given("^I have a valid booking payload$")
    public void i_have_a_valid_booking_payload() {
        booking.setId(0);
        booking.setFlight(1);
        booking.setPassenger(1);
    }

    @When("^I POST it to the /booking endpoint$")
    public void iPOSTItToTheBookingEndpoint() {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.setBookingWithHttpInfo(booking);
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
