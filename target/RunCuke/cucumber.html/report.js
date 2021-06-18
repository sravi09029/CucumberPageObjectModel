$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarGuide.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that \r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 9991568662,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I move to Car For Sale Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 10
    },
    {
      "cells": [
        "buy + Sell"
      ],
      "line": 11
    },
    {
      "cells": [
        "Search cars"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchcarSteps.i_am_on_the_Home_Page_of_CarsGuide_Website(String)"
});
formatter.result({
  "duration": 39296760622,
  "status": "passed"
});
formatter.match({
  "location": "SearchcarSteps.i_move_to_Car_For_Sale_Menu(String\u003e)"
});
formatter.result({
  "duration": 5761248041,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select location as \"ACT - All\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select \"$1,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchcarSteps.click_on_link(String)"
});
formatter.result({
  "duration": 10742716708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchcarSteps.select_carbrand_as_from_AnyMake_dropdown(String)"
});
formatter.result({
  "duration": 4025073075,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchcarSteps.select_as_car_model(String)"
});
formatter.result({
  "duration": 538952533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 20
    }
  ],
  "location": "SearchcarSteps.select_location_as_from_SelectLocation_dropdown(String)"
});
formatter.result({
  "duration": 316058490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 8
    }
  ],
  "location": "SearchcarSteps.select_as_price(String)"
});
formatter.result({
  "duration": 328291709,
  "status": "passed"
});
formatter.match({
  "location": "SearchcarSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 10947898351,
  "status": "passed"
});
formatter.match({
  "location": "SearchcarSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 244168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale ACT | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchcarSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 2405032657,
  "status": "passed"
});
formatter.after({
  "duration": 12639254555,
  "status": "passed"
});
formatter.before({
  "duration": 4452642598,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I move to Car For Sale Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 10
    },
    {
      "cells": [
        "buy + Sell"
      ],
      "line": 11
    },
    {
      "cells": [
        "Search cars"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchcarSteps.i_am_on_the_Home_Page_of_CarsGuide_Website(String)"
});
formatter.result({
  "duration": 17834914209,
  "status": "passed"
});
formatter.match({
  "location": "SearchcarSteps.i_move_to_Car_For_Sale_Menu(String\u003e)"
});
formatter.result({
  "duration": 1426828919,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate used Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-used-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Used-Cars"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "click on \"Used Cars\" link on Used car page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select carbrand as \"Kia\" from AnyMake dropdown on Used car page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select car model on Used car page",
  "rows": [
    {
      "cells": [
        "car model"
      ],
      "line": 30
    },
    {
      "cells": [
        "Carnival"
      ],
      "line": 31
    },
    {
      "cells": [
        "Cerato"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "select location as \"ACT - All\" from SelectLocation dropdown on Used car page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "select \"$2,000\" as price on Used car page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "click on Find_My_Next_Car button on Used car page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should see list of searched cars on Used car page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the page title should be \"Used Kia Carnival Under 2000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Used Cars",
      "offset": 10
    }
  ],
  "location": "UsedCarSteps.click_on_link_on_Used_car_page(String)"
});
formatter.result({
  "duration": 1297838308,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kia",
      "offset": 20
    }
  ],
  "location": "UsedCarSteps.select_carbrand_as_from_AnyMake_dropdown_on_Used_car_page(String)"
});
formatter.result({
  "duration": 3352393516,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSteps.select_car_model_on_Used_car_page(String\u003e)"
});
formatter.result({
  "duration": 6098402162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 20
    }
  ],
  "location": "UsedCarSteps.select_location_as_from_SelectLocation_dropdown_on_Used_car_page(String)"
});
formatter.result({
  "duration": 458491272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000",
      "offset": 8
    }
  ],
  "location": "UsedCarSteps.select_as_price_on_Used_car_page(String)"
});
formatter.result({
  "duration": 435581131,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSteps.click_on_Find_My_Next_Car_button_on_Used_car_page()"
});
formatter.result({
  "duration": 12288699317,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSteps.i_should_see_list_of_searched_cars_on_Used_car_page()"
});
formatter.result({
  "duration": 361929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Kia Carnival Under 2000 for Sale ACT | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchcarSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 528041167,
  "status": "passed"
});
formatter.after({
  "duration": 25091473642,
  "status": "passed"
});
});