package com.swaglabs.tasks;

import com.swaglabs.interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.swaglabs.userinterfaces.ProductsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {
    private String productOne;
    private String productTwo;
    public AddProducts(String productOne, String productTwo) {
        this.productOne = productOne;
        this.productTwo = productTwo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_PRODUCT.of(productOne)),
                Scroll.untilVisibleTarget(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_BACK_TO_PRODUCTS),
                Scroll.untilVisibleTarget(LBL_PRODUCT.of(productTwo)),
                Click.on(LBL_PRODUCT.of(productTwo)),
                Scroll.untilVisibleTarget(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART)
        );
    }
    public static Performable toTheCart(String productOne, String productTwo){
        return instrumented(AddProducts.class, productOne, productTwo);
    }
}
