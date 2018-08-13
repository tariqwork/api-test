# Application
Spring Boot RESTful web application for Phone numbers 

# Overview
This is a Spring Boot web application, implementing RESTful services to provide phone numbers data taken from test data class. Rest controller is in the service package and the JDBC DAO classes in the dao package.

# Prerequisites
Java 1.8
Maven 3.5.3

# Build the maven project
Maven is used as a build tool. Please use the following command to build the project:

mvn clean package 

# Run the application On Windows OS
To run the application on Windows OS. Please use the following command. This command will also start the embedded tomcat as a backend server on port 8080.

java -jar api-test-1.0.0-SNAPSHOT.jar

# Call the REST Service
After successfully run the backend server. Use the browser to call the REST Service as follow:

1. get all phone numners
GET http://localhost:8080/api/allPhoneNumbers

2. get all phone numbers of a single customer
GET http://localhost:8080/api/cutomerPhoneNumbers/{customerId}
e.g. http://localhost:8080/api/cutomerPhoneNumbers/101

3. activate a phone number, use any Rest Client to run POST request
POST http://localhost:8080/api/activatePhoneNumber/{phoneNumber}

# Additional Info
# What this Application have
- I tried to build this app without using database that's why i used a Java class as Mocked data class, but it is possible to connect this application with any database.
- I wrote Unit Test, which runs automatic during package build. 
- I tried my best to use only best and lastest libraries, framework and build tool to make the app sample and easy to maintain.






