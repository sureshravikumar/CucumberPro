package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@FailedScenarios\\failed.txt", glue = "org.stepdefinition2")
public class TestReRunnerClass {

}
