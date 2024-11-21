Feature:  Manager Page Feature

Background: 
Given User is on Login Page
When User click on Manager button

Scenario: Verify Manager Page Fields
Then "Add Customer", "Open Account", "Customers" Fields should be Displayed

Scenario: Verify Create Customer Fields
When Click on Add Customer
Then First Name Field should be Displayed
And Last Name Field should be Displayed
And Postal Code Field should be Displayed
And Add Customer button should be Displayed

@smoke
Scenario: Verify Create Customer with Valid Crediantials
When Click on Add Customer
When User Enter Valid Crediantials
And User Click on Add Customer button
Then Customer should be Created Successfully 