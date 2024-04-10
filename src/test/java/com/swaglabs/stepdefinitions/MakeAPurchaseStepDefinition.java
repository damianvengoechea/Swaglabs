package com.swaglabs.stepdefinitions;

import com.swaglabs.questions.SuccesfullPurchase;
import com.swaglabs.tasks.AddProducts;
import com.swaglabs.tasks.Login;
import com.swaglabs.tasks.PayProducts;
import com.swaglabs.util.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class MakeAPurchaseStepDefinition {

    @Given("that {string} is logged in SwagLabs app")
    public void thatSignedInSwagLabsApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.inSwaglabas());
    }

    @When("He puts in the cart the {string} and {string}")
    public void hePutsInTheCartTheAnd(String productOne, String productTwo) {
        theActorInTheSpotlight()
                .attemptsTo(AddProducts.toTheCart(productOne,productTwo));
    }

    @When("fill fields with {string} {string} {string}")
    public void fillFieldsWith(String name, String lastName, String zip) {
        theActorInTheSpotlight()
                .attemptsTo(PayProducts.selectedInToCart());
    }

    @Then("Then he make payment products")
    public void thenHeMakePaymentProducts() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SuccesfullPurchase.buySuccesfully(),
                                equalTo(Constants.MESSAGE_FINAL))
                );
    }
}
