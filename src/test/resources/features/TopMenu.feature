Feature: Top menu test
  As a user, I want to check top menu options on virgin games website

  Background: I am on homepage
    And       I click on Accept all cookies

  @sanity
  Scenario: User should navigate to Bingo page successfully
    When    I click on Bingo link
    Then    I should navigate to Bingo page successfully


