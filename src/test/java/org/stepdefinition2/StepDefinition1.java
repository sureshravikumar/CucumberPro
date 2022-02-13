package org.stepdefinition2;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	@Given("User needs to be in login page")
	public void user_needs_to_be_in_login_page() {
	}

	@When("User should enter invalid {string} and invalid {string}")
	public void user_should_enter_invalid_and_invalid(String uname, String pass) {
		launchUrl("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		fillTextBox(username, uname);
		WebElement password = driver.findElement(By.id("pass"));
		fillTextBox(password, pass);
	}

	@When("User Clicks login button")
	public void user_Clicks_login_button() {
		WebElement btnClc = driver.findElement(By.name("login"));
		btnClick(btnClc);
	}

	@Then("User will redirect invalid credentail page")
	public void user_will_redirect_invalid_credentail_page() {
		System.out.println("Invalid Credential Page");
	}
}