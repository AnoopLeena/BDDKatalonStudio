Feature: Login Feature

  Scenario Outline: Test login with valid credentials
    Given User navigates to login page
    When User enter <username> and <password>
    And Click login button
    Then User is navigate to home page

    Examples: 
      | username      | password                 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== |

  Scenario Outline: : Consumer can add the product to the shopping cart
    Given User navigates to login page
    When User enter <username> and <password>
    And Click login button
    Then User is navigate to home page
    And User  filter the product
    And Selected the three products and cart it
    Then Proceed to check out

    Examples: 
      | username      | password                 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== |

  Scenario Outline: : Consumer can enter the User Information and Address
    Given User navigates to login page
    When User enter <username> and <password>
    And Click login button
    Then User is navigate to home page
    And User  filter the product
    And Selected the three products and cart it
    Then Proceed to check out
    And Enter the User <FirstName> and <LastName> and <PostalCode>
    And Finish
    Then Logout

    Examples: 
      | username      | password                 | FirstName | LastName | PostalCode |
      | standard_user | qcu24s4901FyWDTwXGr6XA== | Anoop     | TL       |    8765432 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== | Deepu     | Francis  |     873455 |

      
      Scenario Outline: : Consumer can enter the User Information and Address
    Given User navigates to login page
    When User enter <username> and <password>
    And Click login button
    Then User is navigate to home page
    And User  filter the product
    And Selected the three products and cart it
    And Remove one Product from cart
    Then Proceed to check out
    And Enter the User <FirstName> and <LastName> and <PostalCode>
    And Finish
    Then Logout

    Examples: 
      | username      | password                 | FirstName | LastName | PostalCode |
      | standard_user | qcu24s4901FyWDTwXGr6XA== | Anoop     | TL       |    8765432 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== | Deepu     | Francis  |     873455 |
      