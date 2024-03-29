# Selenium Test Automation for OpenMRS Application

This Selenium test automation project aims to ensure the functionality and reliability of the OpenMRS application through automated testing. The tests are written in Java using TestNG as the testing framework, along with logging capabilities implemented using Logger and Selenium WebDriver for browser automation.

## User Stories

### US_401: Checking Login Errors in the System

#### Acceptance Criteria (AC_01)
- Validates the display of warning messages for incorrect login attempts.
- Verifies the user's ability to navigate through login error scenarios.

### US_402: Perform Login in the System

#### Acceptance Criteria (AC_02)
- Tests the successful login process, including valid credentials and location selection.

### US_403: Perform Logout from the System

#### Acceptance Criteria (AC_03)
- Tests the logout functionality ensuring security and proper redirection after logout.

### US_404: Patient Registration

#### Acceptance Criteria (AC_04)
- Tests the patient registration process, including data entry and confirmation.

### US_405: My Account

#### Acceptance Criteria (AC_05)
- Tests the accessibility and functionality of the My Account settings.

### US_406: Patient Search in Patient List

#### Acceptance Criteria (AC_06)
- Tests the ability to search for patients and access their information.

### US_407: Patient Deletion

#### Acceptance Criteria (AC_07)
- Tests the process of deleting patient records from the system.

### US_408: Patient Listing

#### Acceptance Criteria (AC_08)
- Ensures the accuracy of patient listing functionality.

### US_409: Patient Record Merge

#### Acceptance Criteria (AC_09)
- Tests the merging of patient records for efficient management.

### US_410: Incorrect System (Local Computer) Timezone during Appointment Booking

#### Acceptance Criteria (AC_10)
- Validates the display of error messages related to system timezone settings during appointment scheduling.

## Implementation Details

- **Language**: Java
- **Testing Framework**: TestNG
- **Logging**: Logger
- **Browser Automation**: Selenium WebDriver

## Setup Instructions

1. Clone this repository to your local machine.
2. Ensure you have Java JDK installed.
3. Set up your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
4. Install TestNG plugin for your IDE.
5. Import the project into your IDE.
6. Download Selenium WebDriver for your preferred browser (Chrome, Firefox, etc.) and ensure the WebDriver executable is in the system PATH.
7. Run the tests using TestNG test runner.
8. View test results in the IDE or log files generated by Logger.

## Test Execution

- Tests can be executed individually or collectively based on user story requirements.
- Ensure proper setup and configuration before executing tests.
- Review test results and log files for any failures or errors.

## Contributors

- NigarAylaOzcanan - (github.com/NigarAylaOzcanan)
- Onur Girgin - (github.com/Mednasa)
- Beyzanur - (github.com/beyzanurer)
- Ahmet - (github.com/0AhmetKaya0)
- Faruk - (github.com/faruk-ayrcc25)
