# Insurance Management System

The insurance company has two types of customer profiles, individual and enterprise.
An abstract class named "Account" was designed for the customer profile. The Account class is the account information
where all the information of the customer is kept after login to the system. Within the "Account" class is an object
reference of type "User". (as an aggregation relationship)

The "User" class refers to the customer's contact information.

The user class has the following variables

- name (String),
- last name (String),
- email (String),
- password (String),
- job (String),
- age (int),
- address list (ArrayList<Address)
- last login date to the system (Date)

Also, the "User" class has a list of ArrayList type address. Address information is of two types. Home address and
business address. These address classes inherit from an interface named "Address".

A class named "AddressManager" was designed, which is responsible for adding and removing customer addresses. Two static
methods are defined in this class that can add or remove elements from the address list of the "User" object.

In the "Account" class, a final type function that prints customer information on the screen, does not return any
value, and has a name "showUserInfo" has been defined.

In the "Account" class, the insurances taken out by the customers are kept in a list. An abstract class called "
Insurance" is designed, which represents the insurance.Variables of the Insurance class:

- name of the fuse (String),
- cost of insurance (double)
- start-end date of insurance (Date)

Also defined an abstract method called "calculate" This abstract method is populated in the inherited classes below.
4 subclasses are designed to inherit from this abstract class.

- HealthInsurance
- ResidenceInsurance
- TravelInsurance
- CarInsurance

Each subclass calculates the insurance fee by overriding the abstract function called "calculate".

Considering the definitions above, the abstract class "Account" includes the following.

- user's login status (AuthenticationStatus)
- user object (User)
- List of insurances that the user has taken out (ArrayList)

An enum of type AuthenticationStatus is defined. Two constants named SUCCESS and FAIL are defined in the enum. It will
be used if the SUCCESS login is successful. FAIL will be used if there is no login.

A method has been defined so that the users can log to their account. This method receives email and password
information and compares the incoming email password information with the email and password in the User class. If the
entered information is correct, the login process is successful. And the user's login status is pulled to SUCCESS. It
throws an "InvalidAuthenticationException" type error if the login is unsuccessful. This error class was written by
inheriting from the Java class named Exception.

There is a non-abstract method where the user can add and subtract their addresses, and a method that returns a
value that returns the user's login status

An abstract method is defined for the user to add insurance policy. This abstract class is overridden and populated in
subclasses named "Individual" and "Enterprise". Because the profit margin applied to the prices of the packages added by
individual and corporate customers is different.

A class named AccountManager has been designed. The created individual and enterprise accounts are stored in a TreeSet
type data list. A method named login is defined in this class. This method returns the Account object to the place
where it was called, if it retrieves the email and password information provided from outside and navigates through the
Account list and finds a suitable login action. This function calls the "login" function on the Account object.

## Uml Diagram

![Başlıksız Diyagram drawio-3-2-2](https://user-images.githubusercontent.com/74728647/233841612-04a5893e-e5e0-4cf3-bd33-688508c32162.png)
