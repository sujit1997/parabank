package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class LoginSteps {


    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        System.out.println("Inside Step - User is on login page");
    }

    @When("^user enter username and password$")
    public void user_enter_username_and_password() {
        System.out.println("Inside Step - user enter username and password");
    }

    @And("^user click on login button$")
    public void user_click_on_login_button() {
        System.out.println("Inside Step - user click on login button");
    }
        @Then("^user is navigated to the homepage$")
        public void user_is_navigated_to_the_homepage() {
            System.out.println("Inside Step - User is navigated to the homepage");
        }
    }