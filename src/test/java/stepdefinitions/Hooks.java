package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.*;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Hooks {
    public static IOSDriver driver;
    public static Actor user;

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }
}
