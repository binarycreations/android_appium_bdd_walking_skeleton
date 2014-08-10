package com.example;

import org.junit.runner.RunWith;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import static org.junit.Assert.assertNotNull;

public class LaunchOtherScreen {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File app = new File("./bin/android_app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.example");
        capabilities.setCapability("appActivity", ".MainActivity");

        driver = new AppiumDriver(new URL("http://127.0.0.1:8080/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^a user is on the first screen$")
    public void Given_the_user_is_on_the_first_screen() {
        assertNotNull(driver.findElementByName("Hello World, MainActivity"));
    }

    @When("^they click on the Press me button$")
    public void When_they_click_on_the_button() {
        driver.findElementByName("Press me").click();
    }

    @Then("^display the second screen")
    public void Then_display_the_second_screen() {
        assertNotNull(driver.findElementByName("This is a second activity"));
    }
}
