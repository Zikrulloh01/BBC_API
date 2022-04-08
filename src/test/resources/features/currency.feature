Feature: Verify currency count, and existence




  @wip
  Scenario: Count currencies and verify GBP
    When  Go to api endpoint
    Then Verify status code is "200"
    And Count number of currencies
    Then Verify "GBP" exists in the list

