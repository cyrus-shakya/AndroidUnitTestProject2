# INFO-6130 Android App Developement Project 2
This was group project that we did in our Android app development course which focuses on Instrumented test and local tests in android. We used Espresso testing framework for testing all the input fields and buttons.

## Group Name
Group 18

## Group Members
* Cyrus Shakya : 1157720
* Nabin Pun : 1164717

## Local Testing file:
## Overview
It contains code for an Android application designed to perform email address format validation tests. The tests cover a variety of cases, including correct email address formats, incorrect formats, and edge cases.

## Test Cases

### Correct email address format

- **Test Case 1:** Valid email address format - `123@abc.com`
- **Test Case 2:** Valid email address subdomain format - `123@abc.co.ca`

### Incorrect email address format

- **Test Case 3:** Incorrect email address format (incorrect domain) - `123@abc`
- **Test Case 4:** Incorrect email address format (with double dots) - `123@abc..com`
- **Test Case 5:** Incorrect email address format (without username) - `@abc.com`
- **Test Case 6:** Incorrect email address format (without domain) - `tes@ng123`
- **Test Case 7:** Incorrect email address format (empty string) - `""`
- **Test Case 8:** Incorrect email address format (null) - `null`

