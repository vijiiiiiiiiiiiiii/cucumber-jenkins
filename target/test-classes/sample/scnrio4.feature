Feature: Login testme application

Background: display welcome

Given display welcome page

@login @regression

Scenario: login with data credentials

When user opens testme application in browser

When user entering username as "lalitha" And password as "password123" in field

And registered user clicks login

Then verify login page

@regression

Scenario: login with valid data credentials

When user opens testme app in browser

When user entering valid username as "admin" And password as "password456" in field

And clicks login

Then verify login application

