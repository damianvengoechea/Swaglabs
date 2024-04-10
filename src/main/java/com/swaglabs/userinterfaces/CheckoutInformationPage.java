package com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformationPage {
    public static Target TXT_NAME = Target.the("Field Name")
            .located(AppiumBy.accessibilityId("test-First Name"));
    public static Target TXT_LASTNAME = Target.the("Field LastName")
            .located(AppiumBy.accessibilityId("test-Last Name"));
    public static Target TXT_ZIP = Target.the("Field ZIP Code")
            .located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static Target BTN_CONTINUE = Target.the("Button Continue")
            .locatedBy("//android.widget.TextView[@text='CONTINUE']");
}
