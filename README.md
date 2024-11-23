# WafiLife Selenium Test Automation Project

Welcome to the **WafiLife Selenium Test Automation Project**! This repository automates key workflows of the [WafiLife website](https://www.wafilife.com/) using Selenium WebDriver, ensuring robust and reliable end-to-end testing.

Here is the step by step process of automation: https://docs.google.com/spreadsheets/d/1XEiOQ1i6KOZs2WgUjPHagnlX2lKyei3o/edit?usp=sharing&ouid=108463798658545335708&rtpof=true&sd=true
---

## Table of Contents

1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Getting Started](#getting-started)
4. [Prerequisites](#prerequisites)
5. [Installation](#installation)
6. [Automation Features](#automation-features)
7. [Test Execution](#test-execution)
8. [Test Reports](#test-reports)
9. [Contributing](#contributing)
10. [License](#license)

---

## Introduction

This project automates core functionalities of the WafiLife website, including login, author exploration, and order placement, aiming to:
- Ensure smooth user interactions.
- Detect bugs early in the development cycle.
- Minimize manual testing efforts.

---

## Project Structure

```plaintext
src/
├── main/
│   └── java/         # Application logic (if applicable)
├── test/
│   ├── java/         # Selenium test cases
│   └── resources/    # Configuration files and test data
pom.xml               # Maven configuration
README.md             # Project documentation

Getting Started
Follow the steps below to set up and run the tests locally.

Prerequisites
Before proceeding, ensure the following are installed on your system:

Java Development Kit (JDK 17)
Maven for dependency management
Google Chrome and ChromeDriver
IDE such as IntelliJ IDEA or Eclipse
Installation
1. Clone the repository:
git clone https://github.com/your-username/wafilife-selenium-tests.git
cd wafilife-selenium-tests
2. Install dependencies:
mvn clean install
3. onfigure config.properties for environment-specific details.
Automation Features
This test suite automates the following:

Login: Authenticate with valid credentials.
Browse Authors: Navigate to "লেখক" and explore available authors.
Pagination: Scroll and move to the next page.
View Book Details: Select an author and view book information.
Place an Order: Add a book to the cart, proceed to checkout, and complete the order.
Billing and Shipping: Fill out shipping and billing details.
Logout: Safely log out after activities.
Test Execution
Run tests using Maven:

Execute all tests:
mvn test
Run a specific test suite:
mvn -Dtest=TestSuiteName test
Test Reports
Test results are stored in the target/surefire-reports directory. For detailed reports:

Install Allure Reports.
Generate reports using:
allure serve target/allure-results
Contributing
We welcome contributions! Follow these steps:

Fork this repository.
Create a branch:
git checkout -b feature/your-feature-name
Commit changes:
git commit -m "Your message"
Push the branch:
git push origin feature/your-feature-name
Open a pull request.
