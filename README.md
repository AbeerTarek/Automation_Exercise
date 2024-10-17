This project contains automated test scripts for an e-commerce website to verify various functionalities, such as login, signup, adding products to the cart,and more. The tests are implemented using Selenium WebDriver and TestNG.

**Table of Contents**
Project Overview
Technologies Used
Project Structure
Setup Instructions
Running the Tests
Test Scenarios
Contributing
License

**Project Overview**
This repository includes automation test scripts for validating various workflows on an e-commerce website.
It covers functionalities like:

User signup and login process
Adding products to the shopping cart
Filtering products by category, price, and brand
Removing items from the cart
Order checkout process
Technologies Used
Selenium WebDriver: Used for browser automation and interacting with web elements.
TestNG: Testing framework used for managing test cases and assertions.
Java: Programming language used for writing test scripts.
Maven: Build automation tool to manage dependencies and project setup.
Extent Reports: Generates HTML reports for the test results.

**Project Structure**

**Automation_Exercise**

Pages: Page Object Model classes for web pages

Tests: Test classes with test methods

test-output: TestNG-generated reports (after tests run)

pom.xml: Maven configuration file with dependencies

README.md: Project documentation (this file)

**Key Classes:**

Pages/: Contains classes that follow the Page Object Model (POM) pattern, defining the structure and behavior of web pages.
Tests/: Includes test cases covering different scenarios like signup, login, and adding products to the cart.

**Setup Instructions**

**Prerequisites:**

Java Development Kit (JDK) (Version 8 or higher) installed.

Maven installed for dependency management and project setup.

A suitable IDE (like IntelliJ IDEA or Eclipse) for working with Java.

**Running the Tests**

**Via Maven:**

To run the test cases from the command line, use:
mvn test


**Via TestNG:**

Open the testng.xml file in your IDE and run the test suite by right-clicking and selecting Run.

Generate Test Report: After running the tests, TestNG will generate a report in the test-output directory.

**Test Scenarios**

**Login Tests**

Test Case: Verify that a user can successfully sign up and log in using valid credentials.

Test Class: Login_Test

**Add to Cart Tests**

Test Case: Verify that a product can be added to the cart and the correct product details are shown.

Test Class: AddToCart_Test

**Order Checkout Tests**

Test Case: Verify that users can successfully complete the checkout process.

Test Class: Checkout_Test


