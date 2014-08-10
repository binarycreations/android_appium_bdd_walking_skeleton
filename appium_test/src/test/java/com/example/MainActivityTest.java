package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import io.appium.java_client.AppiumDriver;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MainActivityTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        //File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
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

    @Test
    public void testPressingAButton() {
        WebElement button = driver.findElementByName("Press me");
        button.click();
        WebElement text = driver.findElementByName("This is a second activity");
        assertEquals("This is a second activity", text.getText());
    }
}
