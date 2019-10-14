Feature: Adatin smoke test

@TC-101
Scenario: user check the login functionality
Given User enter the URL
Then User should see the application logo
And User enter the email id
And User enter the password
And User click the login button
And User click the logout button

@TC-102
Scenario: To verify whether the check-out date field accepts a later date than checkin date
Given Launch hotel reservation application using URL as in test data
And Login to the application using username and password as in test data.
Then User should see the logo
And Select location as in test data.
And Select hotel as in test data.
And Select room type as in test data.
And Select no-of-rooms as in test data.
And Enter check-in-date later than the checkout date field as in test data.
And Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’.

@TC-103
Scenario: To check if error is reported if check-out date field is in the past
Given Launch reservation application using URL as in test_data.
Then Log in to the application using username and password as in test data.
And Select location as per in the test data
And  select hotel in test data
When  select room type in test data
And select no.of rooms in hotel
And Enter check-out-date as in test data.
And verify the application in error 

@TC-104
Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
Given Launch hotel application using URL as in test data.
Then Login to the web application using username and password as in test data.
And User Select location as in test data.
And User Select hotel as in test data.
And User Select room type as in test data.
And User Select no-of-rooms as in test data.
And User Enter check-out-date as in test data.
And User Select No-of-adults as in test data.
And User Select No-of-children as in test data.
And User Click on Search button.
And Verify that hotel displayed is the same as selected in search Hotel form.

@TC-105
Scenario: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel.
Given Launch hotel reservation application using URL as in test data.(TC-105)
And Login to the application using username and password as in test data.(TC-105)
And Select location as in test data(TC-105)
And Select hotel as in test data.(TC-105)
And Select room type as in test data.(TC-105)
And Select no-of-rooms as in test data.(TC-105)
And Enter check-out-date as in test data.(TC-105)
And Select No-of-adults as in test data.(TC-105)
And Select No-of-children as in test data.(TC-105)
And Click on Search button.(TC-105)
And Verify that check-indate and check-outdates are the same as selected in search hotel form.(TC-105)