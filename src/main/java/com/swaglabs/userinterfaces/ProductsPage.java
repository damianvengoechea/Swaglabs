package com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static Target LBL_PRODUCTS = Target.the("Title Products")
            .located(AppiumBy.xpath("//android.widget.TextView[@text=\'PRODUCTS\']"));
    public static Target LBL_PRODUCT = Target.the("Product buy")
            .locatedBy("//android.widget.TextView[@content-desc=\'test-Item title\' and @text='{0}']");
    public static Target BTN_ADD_TO_CART = Target.the("Button Add Producto")
            .locatedBy("//android.widget.TextView[@text=\'ADD TO CART\']");
    public static Target BTN_BACK_TO_PRODUCTS = Target.the("Button Back to products")
            .locatedBy("//android.widget.TextView[@text=\'BACK TO PRODUCTS\']");
    public static Target BTN_CART = Target.the("Button Cart")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.view.ViewGroup");
}
