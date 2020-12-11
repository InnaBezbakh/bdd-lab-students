Feature: 3Login to website

  Scenario: (7) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page

  Scenario: (8) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page