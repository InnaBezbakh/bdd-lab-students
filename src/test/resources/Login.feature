Feature: Login to website

  Scenario: (1) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page

  Scenario: (2) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page