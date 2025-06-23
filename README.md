# Fund Transfer Feature Testing

This project is designed to test the fund transfer functionality of the Shinhan SOL Vietnam app. It uses Gherkin syntax to define behavior-driven development (BDD) test scenarios for error handling and insufficient balance cases during fund transfers.

Click the image below to watch a demo of the project in action:

[![Watch the demo](assets/demo.gif)](https://www.youtube.com/watch?v=FGrSTT0Lt7I)

## Project Structure

The project is organized as follows:

- **Languages & Frameworks**:
    - Java
    - Maven
- **Test Scenarios**: Written in Gherkin syntax and stored in the `src/test/resources/features` directory.
- **File**: `transfer.feature` contains the test cases for fund transfer scenarios.

## Features

### 1. Error Handling for Invalid Recipient Information
This feature ensures that the app displays appropriate error messages when the recipient's account information cannot be found.

#### Scenarios:
- Searching for a receiving bank using a keyword.
- Entering an invalid account number.
- Verifying the error message displayed.

### 2. Insufficient Balance Prevention
This feature ensures that users cannot proceed with a transfer if their account balance is insufficient.

#### Scenarios:
- Searching for a receiving bank using a keyword.
- Selecting the bank from search results.
- Entering the recipient's account number and transfer amount.
- Verifying the error message displayed.

## Test Data

The test data is defined in the `Examples` section of each scenario outline in the `transfer.feature` file. It includes:

- **Error Handling**:
    - Keywords for bank search.
    - Account numbers.
    - Expected error messages.
- **Insufficient Balance**:
    - Keywords for bank search.
    - Account numbers.
    - Transfer amounts.
    - Expected error messages.

## Prerequisites

- **Java**: Ensure Java is installed on your system.
- **Maven**: Install Maven for dependency management and test execution.
- **IDE**: IntelliJ IDEA or any other Java-compatible IDE.

## How to Run Tests

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Run the tests using Maven:
   ```bash
   mvn test