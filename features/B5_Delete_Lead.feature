Feature: Create contact Leads functionality of TestLeaf Application

@regression
Scenario: TC004_Create new Contact
When Click the Leads
And Click the find leads
Given Enter the phone number '8080808080' and Click find leads
When Click the first contact data
And Click the delete
And Check the data is deleted
