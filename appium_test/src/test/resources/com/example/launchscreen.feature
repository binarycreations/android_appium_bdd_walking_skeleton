Feature: Show an automated BDD test driven using appium

    Scenario: Launch to a new screen
        Given a user is on the first screen
        When they click on the Press me button
        Then display the second screen
