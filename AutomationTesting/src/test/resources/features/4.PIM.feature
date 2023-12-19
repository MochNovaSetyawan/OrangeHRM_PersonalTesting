@PIM
Feature: PIM

  @PIM01
  Scenario: Successfully add employee
    Given Already login
    When Click the PIM module
    And Click add employee tab
    And Input new employee fullname field
    And Input new Employee id
    And Click the save button for add employee
    Then Success message is displayed for add employee

  @PIM02
  Scenario: Successfully input job title
    Given Click job tab in employee list
    When Input join date field
    And Choose job title dropdown
    And Choose job category dropdown
    And Choose sub unit dropdown
    And Choose location dropdown
    And Choose employment status dropdown
    And Click the save button for job detail
    Then Success message is displayed for job detail

