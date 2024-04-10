Feature: Make a purchase Online

  Scenario: Buying products
    Given that "Damian" is logged in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack" and "Sauce Labs Fleece Jacket"
    And fill fields with "name" "lastname" "zipcode"
    Then Then he make payment products