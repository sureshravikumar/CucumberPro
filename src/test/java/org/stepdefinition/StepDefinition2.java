package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {
	@Given("User should be in login page")
	public void user_should_be_in_login_page() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btnClc = driver.findElement(By.name("login"));
		btnClick(btnClc);
	}

	@Then("User will navigate invalid credintail pages")
	public void user_will_navigate_invalid_credintail_pages() {
		System.out.println("Invalid Credential Page");
		driver.quit();
	}

}
