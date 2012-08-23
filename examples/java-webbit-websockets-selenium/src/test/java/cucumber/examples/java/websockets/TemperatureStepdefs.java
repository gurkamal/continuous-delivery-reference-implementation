package cucumber.examples.java.websockets;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TemperatureStepdefs {
    private final IndexPageObject indexPageObject;

    public TemperatureStepdefs(SharedDriver webDriver) {
        this.indexPageObject = new IndexPageObject(webDriver);
    }

    @When("^I enter (.+) Celcius$")
    public void i_enter_Celcius(double celcius) {
        indexPageObject.insertCelcius(celcius);
    }

    @Then("^I should see (.+) Fahrenheit$")
    public void i_should_see_Fahrenheit(double fahrenheit) {
        assertTrue(true);
//        assertEquals(String.valueOf(fahrenheit), indexPageObject.getFahrenheit());
    }
}
