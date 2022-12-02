Feature: Login
 I want to use this template for my feature file
 @tag1
 Scenario: Successful Login with valid credentials
  Given User launch chrome browser
  When User opens the URL "https://lms-frontend-phase2.herokuapp.com/"
  Then User should see the Login page
  When User clicks the Login button after entering invalid password "InvalidPasswd"
  Then User should receive the message "Invalid username and password Please try again"
  When User clicks the Login button after entering invalid username "InvalidUname"
  Then User should get the message "Invalid username and password Please try again"
  When User clicks the Login button after entering valid username "LMS" and password "LMS"
  Then User should see the LMS Home page







