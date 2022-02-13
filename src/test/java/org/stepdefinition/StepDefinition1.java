package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	@Given("User needs to be in login page")
	public void user_needs_to_be_in_login_page() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@When("User should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password() {
		WebElement username = driver.findElement(By.id("email"));
		fillTextBox(username, "Greens@123");
		WebElement password = driver.findElement(By.id("pass"));
		fillTextBox(password, "12345678");
	}

	@When("User Clicks login Button")
	public void user_Clicks_login_Button() {
		WebElement btnClc = driver.findElement(By.name("login"));
		btnClick(btnClc);
	}

	@Then("User will redirect invalid credentail page")
	public void user_will_redirect_invalid_credentail_page() {
		System.out.println("Invalid Credential Page");
		driver.quit();
	}
}
