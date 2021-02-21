$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AutoTrader.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.scenario({
  "name": "User goes to Autotrader Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke_test"
    },
    {
      "name": "@unit_test"
    }
  ]
});
formatter.step({
  "name": "User is in Landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that \"Browse by Make\" are present",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that \"Browse by style\" are present",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that \"Advance Search\" are present",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that search button is present",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that \"Any Make\" and \"Any Model\" is visible",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Entering the advanced search link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke_test"
    },
    {
      "name": "@integration_test"
    }
  ]
});
formatter.step({
  "name": "User click \"Advance search link\" on the homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"30004\" in the zip code textbox",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select \"certified\" checkbox under \"condition\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Send User select convert \"convertible\" checkbox under \"Style\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User update year \"2017\" to \"2020\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select \"BMW\" car from Match, Model and Trim Section",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Search Button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verifies that he is in the result page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verifies that he sees only \"BMW\" cars in listing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "display in console, the number of cars listed in result page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "choose make as \"\u003cmodel\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "model"
      ]
    },
    {
      "cells": [
        "BMW"
      ]
    },
    {
      "cells": [
        "Audi"
      ]
    },
    {
      "cells": [
        "Mercedes"
      ]
    },
    {
      "cells": [
        "Toyota"
      ]
    },
    {
      "cells": [
        "Acura"
      ]
    }
  ]
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "choose make as \"BMW\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "choose make as \"Audi\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "choose make as \"Mercedes\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "choose make as \"Toyota\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "choose make as \"Acura\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});