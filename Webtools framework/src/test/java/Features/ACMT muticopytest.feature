Feature:ACMT MultiCopyTest

  Background:
    Given enter Url

  Scenario: Verifying all the tests in ACMT MultiCopyTest
    Given login to webtools with valid username and password
    When verifying navigation to MultiCopy
    Then verify preview is displayed
    And verify copied route is saved and displayed
    And Close the browser