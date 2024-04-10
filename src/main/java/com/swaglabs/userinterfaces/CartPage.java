package com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static Target BTN_CHECKOUT = Target.the("Button CheckOut")
            .locatedBy("//android.widget.TextView[@text='CHECKOUT']");
}
