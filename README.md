# Cucumber Selenium Java JUnit Automation Framework

This project provides an automation framework for testing the [SauceDemo](https://www.saucedemo.com/) web application using Cucumber Version 7.13.0, JUnit Version 4.12.1, and Selenium Version 4.12.1 with Java 8.

## About

This project aims to automate the testing of the [SauceDemo](https://www.saucedemo.com/) web application to ensure its functionality remains intact. It leverages the power of Cucumber, JUnit, and Selenium with Java to create and execute test scenarios efficiently.

## Getting Started

Follow these steps to set up and use the automation framework.

### Prerequisites

Before you begin, ensure you have the following prerequisites installed on your system:

- **Java Development Kit (JDK)** - Version 8
    - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

- **Maven** - Latest Version
    - [Download Maven](https://maven.apache.org/download.cgi)

- **Google Chrome** - Latest Version
    - [Download Google Chrome](https://www.google.com/chrome/)

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/CucumberSeleniumJavaJunit.git

2. Navigate to the project directory:
    ```bash
    cd CucumberSeleniumJavaJunit
    
3. Build the project using Maven:
    ```bash
    mvn clean install

## Project Structure

Here's an overview of the project's directory structure:

- **`src/main/java/pages`**: Contains Page Object classes that encapsulate page elements and related methods.

- **`src/test/java/runner`**: Holds Cucumber step definitions and the JUnit test runner.

- **`src/test/resources/drivers`**: Stores WebDriver binaries (e.g., ChromeDriver).

- **`src/test/resources/features`**: Contains Cucumber feature files defining test scenarios (e.g., `login.feature`, `shoppingCart.feature`).

- **`src/test/java/support`**: Contains the `WebDriverManager.java` class responsible for managing WebDriver instances.

This structured organization helps maintain a clean and organized project, making it easier to manage and locate different components of your test automation framework.

## Running Tests
To run all tests, use the following command:

    mvn test


## Page Object Pattern
This project follows the Page Object design pattern for creating maintainable and organized test automation code. The Page Object pattern helps improve test code readability, reusability, and maintainability by encapsulating web page elements and their interactions into separate Page Object classes.

## Benefits of Page Object Pattern
By implementing the Page Object pattern, this project offers the following advantages:

Maintainability: Changes in the application's UI can be localized to the relevant Page Object, reducing the impact on the overall test suite.

Reusability: Page Objects can be reused across multiple test scenarios, promoting code efficiency.

Readability: Test scenarios become more readable and self-explanatory, as complex interactions are encapsulated in Page Objects.

Scalability: As the application grows, the Page Object pattern facilitates the addition of new Page Object classes, keeping the test code organized.