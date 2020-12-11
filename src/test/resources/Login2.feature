Feature: 3 Login to website

  Scenario: (5) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page

  Scenario: (6) Login with valid account
    Given I am on the Main page of application
    When I login with user 'inna@mailinator.com' and '999999'
    Then I see text 'My Account' on the successful login page