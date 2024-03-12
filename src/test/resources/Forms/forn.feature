@tag
Feature: Form Feature

  @smoke
  Scenario: To validate simple form and all textboxes present
    Given user opens chrome browser and enter simpleform url
    And textbox should be enabled
    When user enters text in firstname,lastname,email,contact,message
    And user clicks on submitbutton
    Then An alret should be displayed

  