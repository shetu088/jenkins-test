Feature: Login to shopperstop

Scenario Outline: Negative Login Scenario

Given user is on the login page 
Then click on the sign in with email
Then user enters the "<email>" & "<pass>"
Then click on the Sign in button
And user is able to login

Examples:

|email|pass|
|shreshtha.cs093@gmail.com|shre23|
|sheenushetu088@gmail.com|shetu345|
