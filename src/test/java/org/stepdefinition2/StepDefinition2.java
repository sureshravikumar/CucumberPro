package org.stepdefinition2;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		launchUrl("https://www.facebook.com/");
		WebElement btnClc = driver.findElement(By.name("login"));
		btnClick(btnClc);
	}

	@Then("User will navigate invalid credintail pages")
	public void user_will_navigate_invalid_credintail_pages() {
		System.out.println("Invalid Credential Page");
	}

}
