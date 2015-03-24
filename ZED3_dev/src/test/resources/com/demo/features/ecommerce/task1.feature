 
Feature: Registering for a website
@run              
Scenario Outline:Registering developed
                      Given I launch the home page for "<testcase>"
                      When I click on signup button 
                      And I enter firstnam lastname email
                      Then success message should be displayed after signupbutton is clicked
                      Then close the browser
Examples:
                     
                                         |testcase|
                                         |TC_01_SigningUp|                                     
