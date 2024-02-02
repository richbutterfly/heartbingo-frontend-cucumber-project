Feature: Login Test
  As a user, I want to login on website

  Background: I am on homepage
    And       I click on Accept all cookies

  @regression
  Scenario: User should navigate to the correct website using URL
    Then    Verify that the URL is correct for application
