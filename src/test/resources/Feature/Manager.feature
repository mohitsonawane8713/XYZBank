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
When Manager Enter Valid Crediantials
And Manager Click on Add Customer button
Then Customer should be Created Successfully

#@smoke
Scenario: Verify Open Account with Created User
When Manager Click on Open Account button
When Manager Select Customer Name is "Ron Weasly"
And Manager Select Currency is "Dollar"
And Manager Click on Process button
Then Account Should be Created Successfully

#@smoke
Scenario: Verify Total Account of Single User
When Manager Click on Customers
When Manager Search Customer Name "Ron Weasly"
Then Customer Account Information Should be Displayed