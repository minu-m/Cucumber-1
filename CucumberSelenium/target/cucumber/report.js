$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of car search page",
  "description": "In order to validate car search utility as a buyer\r\nI navigate \"http\"//www.carguide.com.au",
  "id": "validation-of-car-search-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4340362742,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Searching for a new car",
  "description": "",
  "id": "validation-of-car-search-page;searching-for-a-new-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the home page of carsguide",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I move to buy + sell menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Search Cars",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Make as \"BMW\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Model as \"1 SERIES\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select Location as \"Australia\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Price as \"10000\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Find my new car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of cars",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the Title should be \"Bmw 1 Series Under 20000 for Sale | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_am_on_the_home_page_of_carsguide()"
});
formatter.result({
  "duration": 13913997069,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_move_to_buy_sell_menu()"
});
formatter.result({
  "duration": 5109265059,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_click_on_Search_Cars()"
});
formatter.result({
  "duration": 13387758425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 18
    }
  ],
  "location": "CarSearch.i_select_Make_as(String)"
});
formatter.result({
  "duration": 164655187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 SERIES",
      "offset": 19
    }
  ],
  "location": "CarSearch.i_select_Model_as(String)"
});
formatter.result({
  "duration": 140544025,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: 1 SERIES\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027ADMIN-VAIO\u0027, ip: \u0027192.168.0.107\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat steps.CarSearch.i_select_Model_as(CarSearch.java:76)\r\n\tat ✽.And I select Model as \"1 SERIES\"(CarSearch.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 22
    }
  ],
  "location": "CarSearch.i_select_Location_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 19
    }
  ],
  "location": "CarSearch.i_select_Price_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CarSearch.i_click_on_Find_my_new_car_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CarSearch.i_should_see_list_of_cars()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 20000 for Sale | carsguide",
      "offset": 21
    }
  ],
  "location": "CarSearch.the_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 778637282,
  "status": "passed"
});
});