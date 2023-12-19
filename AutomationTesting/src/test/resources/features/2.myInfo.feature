@MyInfo
Feature: My Info

  @MYINFO01
    Scenario: Successfuly update personal details
      Given Already login
      When Click the my info module
      And Click personal details tab
      And Input employee fullname field
      And Input nickname field
      And Input employee id field
      And Input other id field
      And Input driver's license number field
      And Input license expiry date field
      And Input ssn number field
      And Input sin number field
      And Choose nationality dropdown
      And Choose marital status dropdown
      And Input date of birth field
      And Choose gender radio button
      And Input military service field
      And Choose smoker or not
      And Click the save button for personal details
      Then Success message is displayed for update personal details

  @MYINFO02
    Scenario: Successfuly update Contact details
      When Click contact details tab
      And Input street one field
      And Input street two field
      And Input city field
      And Input State field
      And Input zip field
      And Choose country dropdown
      And Input home field
      And Input mobile field
      And Input work field
      And Input work email field
      And Input other email field
      And Click the save button for contact details
      Then Success message is displayed for update contact details