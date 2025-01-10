Project Description
-
This project aims to create a web automation testing framework using Selenium WebDriver and Cucumber, adopting the Page Object Model (POM) concept. The primary focus is to test various functional scenarios of the web interface for the DemoBlaze application.
The testing process is conducted on a web application using Selenium WebDriver to automate UI interactions. UI tests involve various interactions, such as button clicks and form submissions, leveraging Selenium's element-finding methods.

Testing Scenarios include:

    Sign Up/Login: Testing user registration and login with valid and invalid credentials.
    Cart: Testing product navigation, adding/removing products from the cart.
    Checkout: Performing the checkout process with both positive and negative cases.

How to Run the Project
-
    Open the project using IntelliJ IDEA.
    Open the terminal.
    Type ./gradlew demoTest
    Press Enter.

Here is the demonstration video for running the project:

https://github.com/user-attachments/assets/1f2a7c95-1658-4dd5-9c16-0d59316d8653






Project Configuration
-
1. Project Directory Structure:
    src/test/java/:  
    - **pages/**: Contains Click, Input and OpenBrowser page classes for performing actions on web page elements.  
    - **stepDef/**: Contains `CheckoutStep`, `LoginStep`, and `SignupStep` classes, serving as step definitions for Cucumber. It also includes the Hooks class for configuring the start and quit driver methods.  
    - **helper/**: Contains the `Utility` class, which manages WebDriver functions and configurations.  
    - **features/**: Contains Cucumber feature files in `.feature` format, defining the test scenarios.  

2. Dependencies and Task Register:
The project is configured with dependencies for RestAssured, Selenium, Cucumber, and WebDriverManager.
![Screenshot 2025-01-10 201012](https://github.com/user-attachments/assets/47cc87fc-8310-4e6b-8007-80c9fb8af61b)
![Screenshot 2025-01-10 201032](https://github.com/user-attachments/assets/e47fdc50-e731-4219-851d-b1b0b18ca30a)

4. Selenium Driver Setup (WebDriverManager):
WebDriverManager is used to manage browser drivers automatically with the following configuration:
![Screenshot 2025-01-10 201116](https://github.com/user-attachments/assets/979a3414-a83d-4603-8201-b95bc4211d81)


UI Test Results for DemoBlaze Application (some) :
-
![Screenshot 2025-01-10 201155](https://github.com/user-attachments/assets/8632f735-1830-40ca-915a-205ae1d28c10)
![Screenshot 2025-01-10 201208](https://github.com/user-attachments/assets/804e73e6-2a66-4245-8e1c-266bdbd11d0e)
![Screenshot 2025-01-10 201226](https://github.com/user-attachments/assets/ea20ee31-c95a-444c-a368-357b41f49252)
![Screenshot 2025-01-10 201245](https://github.com/user-attachments/assets/b9671877-a8c0-43ca-9e6a-e742f4f13036)
![Screenshot 2025-01-10 201300](https://github.com/user-attachments/assets/32f1a13a-0a65-451b-bcef-0108cc669822)

