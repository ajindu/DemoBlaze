Feature: Demoblaze Test Add to cart and checkout

  @web
  Scenario: User add a product to the cart
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    Then user will see message "Product added"

  @web
  Scenario: User add multiple product to the cart
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click home
    And user click laptops menu
    And user click product "MacBook air"
    And user click add to cart
    Then user will see message "Product added"

  @web
  Scenario: User remove a product from the cart
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click delete

  @web
  Scenario: User checkout a product from the cart
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input name "Aji"
    And user input country "Indonesia"
    And user input city "Solo"
    And user input credit card "1234"
    And user input month "03"
    And user input year "2024"
    And user click purchase
    Then user will see thank you pop up
    
  @web
  Scenario: User checkout a product without fill any data
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill name
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input name "Wawan"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill country
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input country "Indonesia"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill city
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input city "Jakarta"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill credit card
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input credit card "12345"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill month
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input month "03"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill year
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input year "2024"
    And user click purchase
    Then user will see message "Please fill out Name and Creditcard."

  @web
  Scenario: User checkout a product only fill name and credit card
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Nokia"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input name "King"
    And user input credit card "9989"
    And user click purchase
    Then user will see thank you pop up

  @web
  Scenario: User checkout a product and fills data in an invalid format
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input name "12345"
    And user input country ","
    And user input city "."
    And user input credit card "//"
    And user input month "_"
    And user input year "1"
    And user click purchase
    Then user will see thank you pop up

  @web
  Scenario: User click purchase without any product in the cart
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    And user will see text welcome
    And user click cart icon
    And user click place order
    And user input name "Aji"
    And user input country "Indonesia"
    And user input city "Solo"
    And user input credit card "1234"
    And user input month "03"
    And user input year "2024"
    And user click purchase
    Then user will see thank you pop up

  @web
  Scenario: User checkout a product without login
    Given opens the web page
    When user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user will see message "Product added"
    And user click cart icon
    And user click place order
    And user input name "Aji"
    And user input country "Indonesia"
    And user input city "Solo"
    And user input credit card "1234"
    And user input month "03"
    And user input year "2024"
    And user click purchase
    Then user will see thank you pop up
