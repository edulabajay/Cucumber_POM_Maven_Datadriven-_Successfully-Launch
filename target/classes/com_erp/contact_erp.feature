Feature: login and create contact Test in CRM

  Scenario Outline: Free CRM Login Test Scenario
    Given User should be on the login page
    Then User enters "<user_input>" and "<pass_input>"
    And User clicks on the login button

  Scenario: Test for homepage
    Given User should be rediredt to homepage
    And User clicks on the create contact button

  Scenario Outline: Test for Create New Contact
    Given User should be redirect to contact page
    And User enters "<first_name>", "<middle_name>", "<last_name>", and "<company_name>"
    

    Examples: 
      | user_input                  | pass_input | first_name | middle_name | last_name | company_name    |
      | ajaybalajikadam69@gmail.com | edulab321  | A          | edulab      | kamle     | edulab exchange |
      | ajaybalajikadam69@gmail.com | edulab321  | B          | erp         | madne     | edulab exchange |
      | test@gmail.com              | edulab321  | C          | erpo        | divekar   | edulab exchange |
