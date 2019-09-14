@bvt
Feature: Login to production
  
  In order to validate user login in production

  Scenario: Verify login to facebook
    Given user navigates to facebook page
    When user validates the homepage title
    Then user enters "valid" user id
    And user enters "valid" password
    And user selects the age category
      | Age      | Location |
      | below 18 | India    |
      | above 18 | USA      |
    Then user should "be" succesfully login
