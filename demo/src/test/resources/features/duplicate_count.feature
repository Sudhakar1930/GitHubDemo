Feature: Duplicate character counting
  As a user
  I want to know how many duplicate characters are in a string
  So that I can analyze the string's content

  Scenario: String with no duplicates
    Given the input string is "abc"
    When I count duplicate characters
    Then the duplicate count should be 0

  Scenario: String with all duplicates
    Given the input string is "aaa"
    When I count duplicate characters
    Then the duplicate count should be 1

  Scenario: String with mixed case duplicates
    Given the input string is "AaBbCc"
    When I count duplicate characters
    Then the duplicate count should be 3

  Scenario: Empty string
    Given the input string is ""
    When I count duplicate characters
    Then the duplicate count should be 0

  Scenario: String with special characters
    Given the input string is "a!a@b#b$c"
    When I count duplicate characters
    Then the duplicate count should be 2

