Feature: Validation of car search page
In order to validate car search utility as a buyer
I navigate "http"//www.carguide.com.au

Scenario: Searching for a new car

	Given I am on the home page of carsguide
	When I move to buy + sell menu
	Then I click on Search Cars	 
	And I select Make as "BMW"
	And I select Model as "1 SERIES"
	And I select Location as "Australia"
	And I select Price as "10000"
	And I click on Find my new car button
	Then I should see list of cars
	And the Title should be "Bmw 1 Series Under 20000 for Sale | carsguide"
	