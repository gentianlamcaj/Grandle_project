
@smoke
Feature: Etsy website title verification
  User Story:
  As e user I'm able to see the title


  Background:
    Given User is on Etsy home page


  Scenario: Title Verification
    Then User sees title is "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"


  Scenario: Etsy Search Functionality Title Verification
    Then User types "Wooden Spoon" in the search box
    And  User clicks search button
    Then User sees "Wooden spoon" is in the title