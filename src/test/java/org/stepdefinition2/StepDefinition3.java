package org.stepdefinition2;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition3 extends BaseClass {
	@Given("user needs to been in amazon page")
	public void user_needs_to_been_in_amazon_page() {
	}

	@When("User will enter product name in search box")
	public void user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d) {

		launchUrl("https://www.amazon.com/");
		List<Map<String, String>> m = d.asMaps();
		WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
		fillTextBox(seachBox, m.get(1).get("products"));
	}

	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
		Assert.assertTrue(false);
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		btnClick(searchBtn);
	}

	@Then("User will redirect to product page")
	public void user_will_redirect_to_product_page() {
		System.out.println("User will be redirected to product Page");
	}
	// Single Dimensional List without header
	// @When("User will enter product name in search box")
	// public void
	// user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d)
	// {
	// List<String> l = d.asList();
	// WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
	// fillTextBox(seachBox, l.get(1));
	// }

	// two Dimensional List without header
	// @When("User will enter product name in search box")
	// public void
	// user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d)
	// {
	// List<List<String>> l = d.asLists();
	// WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
	// fillTextBox(seachBox, l.get(1).get(2));
	// }

	// Single dimensional Map with header
	// @When("User will enter product name in search box")
	// public void
	// user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d)
	// {
	// Map<String, String> m = d.asMap(String.class, String.class);
	// WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
	// fillTextBox(seachBox, m.get("products"));
	// }

	// Two dimensional Map with header
	// @When("User will enter product name in search box")
	// public void
	// user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d)
	// {
	// List<Map<String, String>> m = d.asMaps();
	// WebElement seachBox = driver.findElement(By.xpath("//input[@type='text']"));
	// fillTextBox(seachBox, m.get(1).get("products"));
	// }

	// #Single dimensional list without header
	// #When User will enter product name in search box
	// #| iphone | mac laptop | headset |
	//
	// #Two Dimensional List without header
	// #When User will enter product name in search box
	// #| iphone | mac laptop | headset |
	// #| Tshirts | Pants | Shoes |
	//
	// #Single dimensional Map with header
	// #When User will enter product name in search box
	// #| products | iphone |
	//
	// #Two dimensional Map with header
	// #When User will enter product name in search box
	// #| products |
	// #| iphone |
	// #| Shoes |
}
