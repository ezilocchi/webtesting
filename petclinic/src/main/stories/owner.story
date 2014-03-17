Meta:
@category owner
@Feature search


Narrative: 

In order to find a pet owner
As a user
I want to see the owners list

Scenario: Show all the existing owners

Given I am on the home page
When I search for owners without filtering
Then I should see a list of 10 owners
