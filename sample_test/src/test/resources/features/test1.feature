@testDemo
Feature: This feature covers tests for create user journey of School management application

  Background:
    Given the application is "SchoolManagementApp"


  Scenario Outline: <TestId> Create multiple users in school management application
    Given user is on user list page
    When user clicks on the create user button
    Then user is navigated to create user page
    When user fills relevant details in the create user form with "<FirstName>", "<LastName>", "<School>", "<UserType>", "<YearGroup>"
    And clicks Save button

    Examples:
      | TestId | FirstName | LastName | School     | UserType | YearGroup |
      | 1      | TestF     | TestL    | Test name  | Teacher  | Year 1    |
      | 1      | TestF1    | TestL1   | Test name  | Teacher  | Year 2    |
      | 1      | TestF2    | TestL2   | Test name2 | Pupil    | Year 1    |
      | 1      | TestF3    | TestL3   | Test name3 | Pupil    | Year 13   |