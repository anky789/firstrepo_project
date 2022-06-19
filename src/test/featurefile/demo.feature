Feature:
  Scenario: User is on the app
    Given :User is on the app
    When user enters the credentials
    And user clicks on submit button
    Then user should login into the app
