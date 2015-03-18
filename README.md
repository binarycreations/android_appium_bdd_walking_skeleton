Android Appium BDD Gradle Template
==========

A simple template project with sensible and useful defaults to quickly get started with automated BDD testing on Android.

### Features:
* Multi-project gradle layout containing an Android application and an Appium project side
* Automatic application version generation with git tags
* Example unit test using the Android unit testing framework
* Example Appium test
* Example BDD test using Cucumber and Appium together
* Command line Cucumber runner task
* Generates coverage reports for unit tests
* Generates HTML reports for functional and BDD tests

### Requires
- Gradle
- Java 1.6+
- Android Studio (0.8.2+)
- Node.js
- Appium (make sure you can run the appium server)

### Setup

1. Clone the repo
2. Check it works

    // Start the appium server on port 8080    
    appium -p 8080    
    gradle build cucumber

Or even better use the gradle wrapper

    gradlew build cucumber

Then check the generated reports  
3. Remove the test examples and change the manifest  
4. Go forth and develop!  
