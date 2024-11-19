Feature: Login Page Feature

Scenario: Verify URL and Title of the Login Page
When User is on Login Page
Then URL is Displayed as Expected
And Title is Displayed as "XYZ Bank"

Scenario: Verify Login Page Fields
When User is on Login Page
Then Home button is Displayed
And Customer Login button is Displayed
And Manager Login button is Displayed
