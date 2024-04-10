package com.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.swaglabs.userinterfaces.ProductsPage.LBL_PRODUCTS;

public class LoginSwaglabs implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_PRODUCTS.resolveFor(actor).getText();
    }
    public static Question<String> isSuccesfully() {
        return new LoginSwaglabs();
    }
}
