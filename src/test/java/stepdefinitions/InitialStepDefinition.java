package stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static stepdefinitions.Hooks.*;

public class InitialStepDefinition {

    @Given("I am on the transfer screen of the SOL Vietnam app")
    public void logIntoAppStore() {
        user = Actor.named("User").can(BrowseTheWeb.with(driver));
    }
}