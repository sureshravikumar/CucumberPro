package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 extends BaseClass {
	@Given("user needs to been in amazon page")
	public void user_needs_to_been_in_amazon_page() {
		chromeBrowser();
		launchUrl("https://www.amazon.com/");
	}

	@When("User will enter product name in search box")
	public void user_will_enter_product_name_in_search_box() {
		WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
		fillTextBox(seachBox, "iphone");
	}

	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		btnClick(searchBtn);
	}

	@Then("User will redirect to product page")
	public void user_will_redirect_to_product_page() {
		System.out.println("User will be redirected to product Page");
		driver.quit();
	}

}
