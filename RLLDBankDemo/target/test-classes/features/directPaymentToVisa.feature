Feature: Money transfer to Visa

  Scenario Outline: I am on DbankDemo website
    When I am on the dbankwebpage
    Then I sign in using valid credentials
    And I enter on the Home Page
    Then I  click on Direct Transer to visa
    Then I select the visa account number
    Then I give the transfer amount as '<Amount>'
    And I click on  submit
    And I will get result as '<Result>'

    Examples: 
      | Amount | Result                              |
      |   1000 | Service Unavailable                 |
      |   -500 | Please match the request format     |
      | abcd   | Please match the request format     |
      |        | It is mandontary to fill the Amount |
      |      0 | Service Unavailable                 |
