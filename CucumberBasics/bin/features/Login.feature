@Sanity
Feature: Login
  
  In order to validate user login

  Scenario Outline: Verify login to facebook
    Given user navigates to facebook page
    When user validates the homepage title
    Then user enters "<userid>" user id
    And user enters "<password>" password
    Then user should "<LoginType>" succesfully login

    Examples: 
      | userid  | password | LoginType |
      | valid   | valid    | be        |
      | invalid | invalid  | not       |
