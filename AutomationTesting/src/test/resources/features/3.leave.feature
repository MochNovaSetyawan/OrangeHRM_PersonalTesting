@Leave
Feature: Leave

  @LEAVE01
  Scenario: Successfully add entitlements multiple employeee
    Given Already login
    When Click the leave button
    And Click entitlements in topbar menu
    And Click add entitlements in menu item
    And Choose add to radiobutton in add entitlements
    And Choose leave type dropdown in add entitlements
    And Input entitlement field in add entitlements
    And Click the save button for entitlement
    And Click the confirm button for entitlement
    And Success message is displayed for add entitlements multiple employeee


  @LEAVE02
  Scenario: Successfully apply leave 1 day
    When Click apply in topbar menu
    And Choose leave type dropdown in apply leave
    And Input from date field in apply leave
    And Input to date field in apply leave
    And Choose duration dropdown in apply leave
    And Input Comment field in apply leave
    And Click the save button for apply leave
    Then Success message is displayed apply leave one day

  @LEAVE03
  Scenario: Successfully cancel apply leave
    When Click my leave in topbar menu
    And Click the cancel button
    Then Success message is displayed cancel apply leave
