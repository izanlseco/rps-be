Feature: Play validation
  Background:
    * def emptyBody =
    """
    {}
    """
  Scenario: when '/play' endpoint is called 200 is returned
    Given url baseUrl
    And request emptyBody
    And path 'play'
    When method POST
    Then status 200