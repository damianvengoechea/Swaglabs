package com.swaglabs.stepdefinitions;

import com.swaglabs.questions.LoginSwaglabs;
import com.swaglabs.tasks.Login;
import com.swaglabs.util.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginSwaglabsStepDefinition {

    @When("{word} types his credentials on SwagLabs app")
    public void actorLoginIntoApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.inSwaglabas());
    }

    @Then("He should see the products page")
    public void actorShouldSeeTheProductPage() {
        theActorInTheSpotlight().should(
                seeThat(LoginSwaglabs.isSuccesfully(),equalTo(Constants.TITLE_PRODUCTS))
        );
    }
}
