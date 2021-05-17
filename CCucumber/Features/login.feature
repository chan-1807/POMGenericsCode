Feature: Login to FacebooK
  Scenario Outline: FB LOGIN
    Given Open Browser and Navigate to FB 
    When Entering Credentials "<UserName>" and "<PassWord>"
    And Clicking on login button
    Then It should login to FB
    Examples:
    |UserName|PassWord|
    |user@phptravels.com|demouser|
    |wronguser|Wrongpsw|
