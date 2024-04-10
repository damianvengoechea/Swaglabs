package com.swaglabs.tasks;

import com.swaglabs.interactions.Scroll;
import com.swaglabs.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.swaglabs.userinterfaces.CartPage.BTN_CHECKOUT;
import static com.swaglabs.userinterfaces.CheckoutInformationPage.*;
import static com.swaglabs.userinterfaces.CheckoutOverview.BTN_FINISH;
import static com.swaglabs.userinterfaces.ProductsPage.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PayProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART),
                Scroll.untilVisibleTarget(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(Constants.NAME).into(TXT_NAME),
                Enter.theValue(Constants.LASTNAME).into(TXT_LASTNAME),
                Enter.theValue(Constants.ZIP).into(TXT_ZIP),
                Click.on(BTN_CONTINUE),
                Scroll.untilVisibleTarget(BTN_FINISH),
                Click.on(BTN_FINISH)
        );
    }
    public static Performable selectedInToCart() {
        return instrumented(PayProducts.class);
    }
}
