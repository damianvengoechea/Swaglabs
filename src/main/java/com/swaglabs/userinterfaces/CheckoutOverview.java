package com.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverview {
    public static Target BTN_FINISH = Target.the("Button Finish")
            .locatedBy("//android.widget.TextView[@text='FINISH']");
}
