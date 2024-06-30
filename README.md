# CODTECH-Task
/*OUTPUT/*
![Screenshot (105)](https://github.com/ThomasSoram/CODTECH-Task/assets/171699330/1c7544e4-37b0-4556-989d-08ffed9fd742)

# Project Description
This project demonstrates the use of TestNG for automating tests in a Java application. TestNG is a powerful testing framework inspired by JUnit and NUnit, designed to cover all categories of tests: unit, functional, end-to-end, integration, etc.

# Features
1. Parallel Testing: Configured to run tests in parallel with a thread count of 5 for faster execution.
2. Test Organization: Includes multiple test classes to validate different aspects of the application.
3. Scalability: Easily scalable to include more tests and functionalities.

# Test Configuration
The TestNG suite is configured in testng.xml to run the following test classes in parallel


# Test Classes
1. testNG.Login1: Tests related to the first login scenario.
2. testNG.Login2: Tests for the second login scenario.
3. testNG.Login3: Tests covering the third login scenario.
4. testNG.Login4: Additional tests for a fourth login scenario.

# Getting Started
#Prerequisites
1.Java Development Kit (JDK) 8 or higher
2.Maven (for dependency management)
3.TestNG library

# Setps

1. If you're using Maven, add the TestNG dependency to your pom.xml file
   - <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.0</version>
    <scope>test</scope>
</dependency>
2. If you're not using Maven, download the TestNG JAR from the TestNG website and add it to your project's build path.
3. Create a new Java class for your TestNG test. For example, you can name it Login1.java.
4. Write the TestNG Test
5. Create a TestNG XML File
6. Run the TestNG Test
7. After running the tests, you can review the test results in the console output or the generated TestNG reports.

#Additional Tips

- You can add more test methods in the Login1 class to cover additional scenarios.
- Use TestNG annotations like @BeforeMethod, @AfterMethod, etc., to set up and tear down specific preconditions for each test method.
- Parameterize your tests using the @DataProvider annotation to run the same test with different data sets.


# Contributing
Contributions are welcome! Please fork this repository and submit pull requests with your improvements.

# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Acknowledgements
TestNG for providing a robust testing framework.









