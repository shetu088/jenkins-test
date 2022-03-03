Feature: Login Feature

Scenario: Postive login scenario

Given user is on login page
When user enters username & password
And user clicks on submit button
Then user is on home Page


Scenario Outline: Negative login scenario

Given user is on login page
When user enters <username> & <password>
And user clicks on submit button
Then user is on home Page

Examples:

|user|pass|
|shre|shre123|
|shtr|sh456|