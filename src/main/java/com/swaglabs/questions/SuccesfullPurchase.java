package com.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.swaglabs.userinterfaces.CheckoutComplete.LBL_MESSAGE_FINAL;

public class SuccesfullPurchase implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return LBL_MESSAGE_FINAL.resolveFor(actor).getText();
    }
    public static Question<String> buySuccesfully() {
        return new SuccesfullPurchase();
    }
}
