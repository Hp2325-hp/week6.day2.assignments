Feature: Create contact Leads functionality of TestLeaf Application

@snaity
Scenario Outline: TC004_Create new Contact
When Click the contacts
And Click create contact
Given Enter the contact firstname and lastname <fname> <lname>
And Enter the contact local firstname and lastname <localfname> <locallname>
And Enter the contact depart,desc,mail and country <depart> <desc> <mail> <country>
When Click contact submit button
And Click edit and update the desc 'New Description'

Examples:
|fname|lname|localfname|locallname|depart|desc|mail|country|
|'h'|'h'|'h'|'p'|'EEE'|'EEE'|'mail@gmail.co'|'New York'|