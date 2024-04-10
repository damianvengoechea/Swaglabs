package com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target TXT_USER = Target.the("Username")
            .located(AppiumBy.accessibilityId("test-Username"));
    public static Target TXT_PASS = Target.the("Password")
            .located(AppiumBy.accessibilityId("test-Password"));
    public static Target BTN_LOGIN = Target.the("Button Login")
            .located(AppiumBy.accessibilityId("test-LOGIN"));
    public static Target LBL_MESSAGE_ERROR = Target.the("Message Error")
            .located(AppiumBy.xpath("//android.widget.TextView[@text=\'Password is required\']"));
}
