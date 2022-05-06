Feature: AddToCart Feature

  Scenario Outline: Test login with valid credentials
    Given User navigates to login page
    When User enter <username> and <password>
    And Click login button
    Then User is navigate to home page

    Examples: 
      | username      | password                 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== |
