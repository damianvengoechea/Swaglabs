package com.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutComplete {
    public static Target LBL_MESSAGE_FINAL = Target.the("Text order complete")
            .locatedBy("//android.widget.TextView[@text=\'THANK YOU FOR YOU ORDER\']");
}
