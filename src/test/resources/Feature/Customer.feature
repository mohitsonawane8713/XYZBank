Feature: Customer Page Feature


Scenario: Verify Customer Login Fields
Given User is on Login Page
When User Click on Customer button 
Then Customer Login Page Should be Displayed

Scenario: Verify Customer Login
Given User is on Login Page
When User Click on Customer button
When User Enters User Name "Ron Weasly"
When User click on Login button
Then Home Page Should be Displayed

Scenario: Verify Deposit Amount and Total Balance


Scenario: Verify Withdrawl Amount and Total Balance


Scenario: Verify Transaction History
