# tests-junit--requirements-engineering
application with the purpose of building tests for some requirements developed during the Requirements Engineering discipline.


### This tests are building use TDD - Test-driven development with colleagues.

## Test Driven Development 

Step 1:
it is a software development practice where the coding of functionalities starts from the writing of unit tests.
Write a test for a feature we want to implement. This test must fail as we haven't implemented it yet so we move to the red step.


Step 2: 
After the failures phase, we build the test and it should pass successfully. Thus, we reached the green step of TDD

Step 3:
After building the test, the Refactoring phase arrives, which consists of dividing and conquering. Refactoring the code we found better points in our tests


## The System:
Our tests were based on an application that aims to improve the service and bureaucracy of Health units in the city of Recife, Pernambuco, Brazil.
The application has 3 views to help patients, System Administrators and Doctors who work in Basic Health Units - UBS or also known as Family Health Units.


### Requirements:
#### [RF001] Register Account
The system should register a new user. The user has a first name, last name,
Individual Taxpayer Registration (CPF), date of birth, SUS card, e-mail, password and
phone number. The e-mail, CPF and SUS card number are unique to
each user. The password must contain at least one uppercase alphabetic character and
a numeric. The password must have a minimum of 8 characters and a maximum of 64
characters.
The user can register in the system using data from their Google social network.
At the time of registration, the system must validate whether the e-mail entered is really
of user.
If the user is a minor, the system must block the remaining stages of the
registration and open a section that asks for the CPF of the person responsible, after that the system
will unlock the steps to continue the registration.

#### [RF002] Login
In this section, the system requests the user's CPF and password or authentication via Google

#### [RF003] Issue SUS card
This function allows the user to issue the SUS card after verification of
that the user does not have the SUS card

#### [RF004] Forgot password?
This function allows the user to recover the password by entering his CPF
and email.

#### [RF010] See profile
In this section, the system displays service options focused on patient data
how the functions change data, schedules and history.

#### [RF013] Change data
In this section, the system displays a screen for changing the registration data of the
user. Allowing to change password, e-mail, address and inactivation of
account

#### RF014] Change password
This function allows the user to change the password by entering the password
current and new password.

#### [RF015] Deactivate account
This function allows the user to deactivate his account, requiring the insertion of the
current password and two-step confirmation.

#### [RF016] Logout
This function allows the user to exit the application after confirmation.

#### [RF016] Logout
This function allows the user to exit the application after confirmation

#### [RF017] Login
This function allows the administrator to login through the CPF and password.

#### [RF020] Medical Team
This function allows the administrator to view the name, CRM and specialty of
doctors who make up the UBS.

#### [RF026] Select patient
This function allows the clinician to select a patient by displaying other functions
to help with care.



## The requirements mentioned above were selected by each of the collaborators in the tests project. These are just some project requirements

Colaboradores: 
1. Lilian Beatriz
2. José Alfredo
3. Raphael Alcântara
