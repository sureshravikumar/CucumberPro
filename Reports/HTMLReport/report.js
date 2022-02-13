$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login2.feature");
formatter.feature({
  "name": "To validate Login Functionality of FaceBook Apllication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login with invalid username and innvalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should enter invalid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Clicks login button",
  "keyword": "And "
});
formatter.step({
  "name": "User will redirect invalid credentail page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Java",
        "java"
      ]
    },
    {
      "cells": [
        "Selenium",
        "selenium"
      ]
    },
    {
      "cells": [
        "Testing",
        "testing"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User needs to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.user_needs_to_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with invalid username and innvalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should enter invalid \"Java\" and invalid \"java\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.user_should_enter_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_Clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will redirect invalid credentail page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_will_redirect_invalid_credentail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User needs to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.user_needs_to_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with invalid username and innvalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should enter invalid \"Selenium\" and invalid \"selenium\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.user_should_enter_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_Clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will redirect invalid credentail page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_will_redirect_invalid_credentail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User needs to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.user_needs_to_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with invalid username and innvalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should enter invalid \"Testing\" and invalid \"testing\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.user_should_enter_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_Clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will redirect invalid credentail page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_will_redirect_invalid_credentail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/products.feature");
formatter.feature({
  "name": "To validate search functionality of user page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To search the Searchability of desired product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user needs to been in amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition3.user_needs_to_been_in_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter product name in search box",
  "rows": [
    {
      "cells": [
        "products"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "Shoes"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_will_enter_product_name_in_search_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_clicks_the_search_button()"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat org.stepdefinition2.StepDefinition3.user_clicks_the_search_button(StepDefinition3.java:31)\r\n\tat ✽.User clicks the search button(file:src/test/resources/Features/products.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User will redirect to product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_will_redirect_to_product_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});