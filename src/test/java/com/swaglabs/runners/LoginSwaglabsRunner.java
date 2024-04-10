package com.swaglabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_swaglabs.feature",
        glue = "com.swaglabs.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginSwaglabsRunner {
}
