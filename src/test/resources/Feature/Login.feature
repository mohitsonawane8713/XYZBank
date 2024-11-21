Feature: Login Page Feature

Scenario: Verify URL and Title of the Login Page
When User is on Login Page
Then URL is Displayed as Expected
And Title should be Displayed as "XYZ Bank"

Scenario: Verify Login Page Fields
When User is on Login Page
Then Home button should be Displayed
And Customer Login button should be Displayed
And Manager Login button should be Displayed
