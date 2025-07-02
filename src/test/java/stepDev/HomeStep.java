package stepDev;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class HomeStep {

    private static AppiumDriver driver;

    @Given("Install the app color note")
    public void installTheAppColorNote() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "15"); // Ganti dengan nama device Android Anda (misalnya, "emulator-5554" atau nama perangkat fisik)
        capabilities.setCapability("appium:automationName", "uiautomator2");
        capabilities.setCapability("appium:app", "/Users/user/Downloads/ToDo(2).apk");



        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
    }

    @And("Click next button")
    public void clickNextButton() {
    }

    @And("Click permisson button")
    public void clickPermissonButton() {
    }

    @And("Click skip button")
    public void clickSkipButton() {
    }

    @Given("The color is opened")
    public void theColorIsOpened() {
    }


    @When("I Click add buttton")
    public void iClickAddButtton() {
    }

    @And("I add task {string}")
    public void iAddTask(String tittle) {
    }

    @Then("The task {string} is displayed")
    public void theTaskIsDisplayed(String tittleDisplay) {
    }
}
