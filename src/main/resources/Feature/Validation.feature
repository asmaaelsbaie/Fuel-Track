@smoke
Feature: Validation
  Scenario:As a user i want to Enter my Car date
    Given enter car_Num "ASD1235"
    And enter fuel_in_liters "75"
    And enter Fuel_cost "100"
    And enter Fuel_type "Petrol"
    And enter Date and time "12-21-2023T04:30:11"
    And enter Customer_ID "CVB123"
    Then Click edit
