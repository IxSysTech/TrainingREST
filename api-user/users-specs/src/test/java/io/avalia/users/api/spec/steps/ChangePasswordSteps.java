package io.avalia.users.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.api.spec.helpers.Environment;

public class ChangePasswordSteps {
    private String email;
    private String oldPassword;
    private String newPassword;

    public ChangePasswordSteps(Environment environment) {
        ParentSteps.environment = environment;
        ParentSteps.api = environment.getApi();
    }

    @Given("^I have an existing user email with a good old password and a new password$")
    public void i_have_an_existing_user_email_with_a_good_old_password_and_a_new_password() {
        this.email = "david.simeonovic@heig-vd.ch";
        this.oldPassword = "password";
        this.newPassword = "password";
    }

    @Given("^I have an existing user email with an invalid old password and a new password$")
    public void i_have_an_existing_user_email_with_an_invalid_old_password_and_a_new_password() {
        this.email = "david.simeonovic@heig-vd.ch";
        this.oldPassword = "InvalidPassword";
        this.newPassword = "password";
    }

    @When("^I POST it to the /user/changePassword endpoint$")
    public void i_POST_it_to_the_user_changePassword_endpoint() throws  Throwable {
        try{
            ParentSteps.lastApiResponse = ParentSteps.api.changePasswordWithHttpInfo(email, oldPassword, newPassword);
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
