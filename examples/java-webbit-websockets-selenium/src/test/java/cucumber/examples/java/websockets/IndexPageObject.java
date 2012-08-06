package cucumber.examples.java.websockets;

/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 8/6/12
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPageObject {



    private final WebDriver webDriver;

    public IndexPageObject(SharedDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void insertCelcius(double celcius)
    {
        webDriver.findElement(By.id("celcius")).sendKeys(String.valueOf(celcius));
    }

    public String getFahrenheit()
    {
        return webDriver.findElement(By.id("fahrenheit")).getAttribute("value");
    }

}
