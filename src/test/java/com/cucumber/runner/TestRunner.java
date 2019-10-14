package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.AdactinBaseclass.AdactinBaseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition",tags= {"@TC-105"})
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		driver = AdactinBaseclass.browserlaunch("chrome");
	}

	@AfterClass
	public static void quit() {
driver.quit();
	}
}
