Feature: Test001

  Scenario Outline: Add product to basket
    Given Open shopwebsite
    When Open first category
    And Choose secend product
    And Click Add to basket button
    And Click Check a basket
    Then I see my product in basket
    Examples:
