# mobile-test

## Overview

**mobile-test** is an automated mobile testing framework for Android applications using Appium and JUnit. It provides reusable page objects and test cases to validate the functionality of the CTAppium demo app.

---

## Project Structure

```
src/
  main/
    java/
      pt/
        antonio/
          ctappium/
            core/   # Core framework classes (driver, base page/test)
            page/   # Page objects for app screens
            test/   # JUnit test cases
    resources/
      CTAppium-1-1.apk  # Demo app under test
```

---

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- Android SDK & emulator or real device
- Appium server running (`http://localhost:4723/wd/hub`)

### Setup

1. **Clone the repository**
   ```sh
   git clone <your-repo-url>
   cd mobile-test
   ```
2. **Install dependencies**
   ```sh
   mvn clean install
   ```
3. **Start emulator/device and Appium server**

### Running Tests

Run all tests with Maven:
```sh
mvn test
```

---

## Test Reports & Screenshots

- Test results are displayed in the console.
- Screenshots are saved in `target/screenshot/` after each test.

---

## Key Components

- **core/DriverFactory.java**: Manages the Appium driver lifecycle.
- **core/BasePage.java**: Provides common UI actions.
- **core/BaseTest.java**: Handles test setup/teardown and screenshot capture.
- **page/**: Page objects for each app screen.
- **test/**: JUnit test classes for different features.

---

## Customization

- Update device and app path in `core/DriverFactory.java` as needed.
- Add new page objects and tests following the existing structure.

---