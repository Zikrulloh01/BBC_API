$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/currency.feature");
formatter.feature({
  "name": "Verify currency count, and existence",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Count currencies and verify GBP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "Go to api endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "api_steps.go_to_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify status code is \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "api_steps.verify_status_code_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Count number of currencies",
  "keyword": "And "
});
formatter.match({
  "location": "api_steps.count_number_of_currencies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"GBP\" exists in the list",
  "keyword": "Then "
});
formatter.match({
  "location": "api_steps.verify_exists_in_the_list(String)"
});
formatter.result({
  "status": "passed"
});
});