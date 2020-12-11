Feature: Login1 to website

Scenario: (3) Login with valid account
Given I am on the Main page of application
When I login with user 'inna@mailinator.com' and '999999'
Then I see text 'My Account' on the successful login page

Scenario: (4) Login with valid account
Given I am on the Main page of application
When I login with user 'inna@mailinator.com' and '999999'
Then I see text 'My Account' on the successful login page