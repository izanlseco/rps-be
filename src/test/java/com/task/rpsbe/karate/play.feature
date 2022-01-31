Feature: Play validation
  Scenario: when '/play' endpoint is called 200 is returned
    Given url baseUrl
    And path 'play'
    When method GET
    Then status 200