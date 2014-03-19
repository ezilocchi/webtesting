Feature: Create a new Owner
  In order to manage Owners
  As a regular user
  I need to be able to create Owners

  Scenario: Crear Owner de forma exitosa
    Given I am on the homepage
    And I follow "Find owners"
    And I follow "Add Owner"
    When I fill in "firstName" with "My Name"
    When I fill in "lastName" with "My Last Name"
    When I fill in "address" with "My Address"
    When I fill in "city" with "My City"
    When I fill in "telephone" with "123456"
    When I press "Add Owner"
    Then I should see "Owner Information"

  Scenario: Validar direccion requerida
    Given I am on the homepage
    And I follow "Find owners"
    And I follow "Add Owner"
    When I fill in "firstName" with "My Name"
    When I fill in "lastName" with "My Last Name"
    When I fill in "city" with "My City"
    When I fill in "telephone" with "123456"
    When I press "Add Owner"
    Then I should see "New Owner"
    And I should see "may not be empty"

  Scenario: Validar formato de numero de telefono
    Given I am on the homepage
    And I follow "Find owners"
    And I follow "Add Owner"
    When I fill in "firstName" with "My Name"
    When I fill in "lastName" with "My Last Name"
    When I fill in "address" with "My Address"
    When I fill in "city" with "My City"
    When I fill in "telephone" with "abc"
    When I press "Add Owner"
    Then I should see "New Owner"
    And I should see "numeric value out of bounds (<10 digits>.<0 digits> expected)"
