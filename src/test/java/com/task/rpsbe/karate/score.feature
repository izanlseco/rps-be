Feature: Score validationServiceService

  Background:
    * def baseUrl = 'http://localhost:8080/'

  Scenario: when '/score' endpoint is called 200 is returned
    Given url baseUrl
    And path 'score'
    When method GET
    Then status 200