$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "\r\nIn order to validate user login",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify login to facebook",
  "description": "",
  "id": "login;verify-login-to-facebook",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user navigates to facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cuserid\u003e\" user id",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should \"\u003cLoginType\u003e\" succesfully login",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login;verify-login-to-facebook;",
  "rows": [
    {
      "cells": [
        "userid",
        "password",
        "LoginType"
      ],
      "line": 14,
      "id": "login;verify-login-to-facebook;;1"
    },
    {
      "cells": [
        "valid",
        "valid",
        "be"
      ],
      "line": 15,
      "id": "login;verify-login-to-facebook;;2"
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "not"
      ],
      "line": 16,
      "id": "login;verify-login-to-facebook;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 421252,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify login to facebook",
  "description": "",
  "id": "login;verify-login-to-facebook;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigates to facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"valid\" user id",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters \"valid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should \"be\" succesfully login",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_page()"
});
formatter.result({
  "duration": 144874098,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 107762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_enters_the_user_id(String)"
});
formatter.result({
  "duration": 3205802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_enters_the_password(String)"
});
formatter.result({
  "duration": 159544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "be",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_should_succesfully_login(String)"
});
formatter.result({
  "duration": 126422,
  "status": "passed"
});
formatter.after({
  "duration": 69976,
  "status": "passed"
});
formatter.before({
  "duration": 118491,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify login to facebook",
  "description": "",
  "id": "login;verify-login-to-facebook;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigates to facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"invalid\" user id",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters \"invalid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should \"not\" succesfully login",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_page()"
});
formatter.result({
  "duration": 139017,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 104497,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_enters_the_user_id(String)"
});
formatter.result({
  "duration": 122690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_enters_the_password(String)"
});
formatter.result({
  "duration": 151147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 13
    }
  ],
  "location": "LoginStep.user_should_succesfully_login(String)"
});
formatter.result({
  "duration": 154879,
  "status": "passed"
});
formatter.after({
  "duration": 94700,
  "status": "passed"
});
});