package com.swaglabs.tasks;

import com.swaglabs.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.swaglabs.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(LoginPage.TXT_USER, isEnabled()).forNoMoreThan(10).seconds(),
                //Click.on(Target.the("userName").located(AppiumBy.xpath("//android.widget.EditText[@content-desc=\'test-Username\']"))),
                Enter.theValue(Constants.USER).into(TXT_USER),
                Enter.theValue(Constants.PASS).into(TXT_PASS),
                Click.on(BTN_LOGIN)
        );
    }
    public static Performable inSwaglabas() {
        return instrumented(Login.class);
    }
}
