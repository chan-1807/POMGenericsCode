$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to FacebooK",
  "description": "",
  "id": "login-to-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FB LOGIN",
  "description": "",
  "id": "login-to-facebook;fb-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Browser and Navigate to FB",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Entering Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clicking on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "It should login to FB",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_Browser_and_Navigate_to_FB()"
});
formatter.result({
  "duration": 8185845200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.entering_Credentials()"
});
formatter.result({
  "duration": 280660500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicking_on_login_button()"
});
formatter.result({
  "duration": 61053200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.it_should_login_to_FB()"
});
formatter.result({
  "duration": 4841875700,
  "status": "passed"
});
});