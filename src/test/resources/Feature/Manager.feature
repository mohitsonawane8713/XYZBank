Feature:  Manager Page Feature

Background: 
Given User is on Login Page
When User click on Manager button

Scenario: Verify Manager Page Fields
Then "Add Customer", "Open Account", "Customers" Fields is Displayed

Scenario: Verify Create Customer Fields
When Click on Add Customer
Then First Name Field is Displayed
And Last Name Field is Displayed
And Postal Code Field is Displayed
And Add Customer button is Displayed

Scenario: Verify Create Customer with Valid Crediantials
When Click on Add Customer
When User Enter Valid Crediantials
And User Click on Add Customer button
Then Customer is Created Successfully