#Author: fideljose.training
Feature:Testing page
  Validate page load

  Background:
    * def uldApi = 'https://lingering-water-336.getsandbox.com/prueba'

#  @Mantis
  Scenario: Load main page
    Given url uldApi
#    And request {"paload": "This page load file"}
    When method GET
    Then status 200
#    And match $.._responseSize contains '#notnull'
    And match $.._responseSize contains 1
    And match $.._version contains "3.0"