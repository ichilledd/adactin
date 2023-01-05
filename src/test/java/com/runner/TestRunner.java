package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
glue={"stepdefinition"},
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true,
publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
