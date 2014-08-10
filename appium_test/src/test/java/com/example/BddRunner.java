package com.example;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * {@link com.example.BddRunner} is responsible for defining the Cucumber test runner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:build/cucumber-html-report",
        "json:build/cucumber-report.json"})
public class BddRunner {

}
