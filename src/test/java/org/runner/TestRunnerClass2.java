package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "org.stepdefinition2", dryRun = false, monochrome = true, strict = true, tags = "@sanity", plugin = {
		"pretty", "html:C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\Reports\\HTMLReport",
		"json:C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\Reports\\JSONReport\\jsonreport.json",
		"junit:C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\Reports\\JUNITReport\\junitreport.xml",
		"rerun:C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\FailedScenarios\\failed.txt" })

public class TestRunnerClass2 {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate(
				"C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\Reports\\JSONReport\\jsonreport.json");
	}
}
