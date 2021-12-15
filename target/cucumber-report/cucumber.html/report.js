$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginTest.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user login and logout successfully",
  "description": "",
  "id": "verify-user-login-and-logout-successfully",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10151623700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify user logout successfully",
  "description": "",
  "id": "verify-user-login-and-logout-successfully;verify-user-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enter the username to login \u003c\"Admin\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enter password to login \u003c\"admin123\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should verify welcome text",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click on logout",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User should logout successfully \u003c\"LOGIN Panel\"\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLoginSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 138255400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    }
  ],
  "location": "AddUserSteps.userEnterTheUsernameToLogin(String)"
});
formatter.result({
  "duration": 170953201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 31
    }
  ],
  "location": "AddUserSteps.userEnterPasswordToLogin(String)"
});
formatter.result({
  "duration": 107779800,
  "status": "passed"
});
formatter.match({
  "location": "AddUserSteps.userClickOnLoginButton()"
});
formatter.result({
  "duration": 5089736400,
  "status": "passed"
});
formatter.match({
  "location": "UserLoginSteps.userShouldVerifyWelcomeText()"
});
formatter.result({
  "duration": 61715500,
  "status": "passed"
});
formatter.match({
  "location": "UserLoginSteps.userClickOnLogout()"
});
formatter.result({
  "duration": 33411091600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN Panel",
      "offset": 34
    }
  ],
  "location": "UserLoginSteps.userShouldLogoutSuccessfully(String)"
});
formatter.result({
  "duration": 38122100,
  "status": "passed"
});
formatter.after({
  "duration": 777604000,
  "status": "passed"
});
});