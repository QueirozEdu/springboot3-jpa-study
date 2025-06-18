
# Ecommerce springboot project

Back-end project for an e-commerce application aimed at enhancing studies in Java and Spring Boot with Hibernate and JPA.

The goal of this project is to develop the back-end of an e-commerce application based on the Domain Model, implementing the corresponding classes, relationships, and endpoints, and making them available for access through a REST API.

![GitHub License](https://img.shields.io/github/license/QueirozEdu/springboot3-jpa-study)




## About this project
- This project is based on the following Domain Model:


 ![Domain Model](https://github.com/QueirozEdu/assets/blob/main/DomainModel.png "Domain Model")

- And on the following Domain Instance

 ![Domain Instance](https://github.com/QueirozEdu/assets/blob/main/DomainInstace.png "Domain Instance")





## Stacks

**Back-end:** Spring Boot, JPA, Hibernate - Java


## Running locally

1º Clone the repository

```bash
  git clone https://github.com/QueirozEdu/springboot3-jpa-study
```

2º Open in the IDE of your choose.

3º Right click StudyApplication.java and choose to Run as -> Spring Boot App

4º If you're using the Spring tools for Eclipse you can simply click the Run button on the Boot Dashbaord

5º If the console displays SQL commands made by Hibernate that probably means your project was build successfully. If not, check to see if all the dependencies in the pom.xml file were downloaded correctly.   

6º If everything goes well you are ready to navigate to the h2 console (at localhost:8080/h2-console if no other configuration was made) and connect to the Database. The tables created are displayed and you can run SQL commands to see the data.

7º Additionally, you can create requests to your API using softwares like Postman and Insomnia 




 



## Endpoints

The following endpoints are available for consulting

### 1. Get
```bash
  /users
```
Returns a list of all users

### 2. Get
```bash
  /users/1
```
Returns the user with id 1. Change the id to get different users

### 3. POST
```bash
  /users
```
Creates a new user. You will also need to pass a body with the following parameters:
```bash
  { 
    "name": "Bob Brown", 
    "email": "bob@gmail.com", 
    "phone": "977557755", 
    "password": "123456" 
}
```
You can edit the values to anything you like. 
Dont forget to include in the Header the Key: 
```bash
  Content-Type: application/json
```

### 4. PUT
```bash
  /users/{id}
```
Edits that user. Similarly to create a user, you'll need to provide a body.
```bash
  { 
    "name": "Bob Brown", 
    "email": "bob@gmail.com", 
    "phone": "977557755" 
}
```
Notice you cannot change the uers ID or password.

### 5. DELETE
```bash
  /users/{id}
```
Delete a user
