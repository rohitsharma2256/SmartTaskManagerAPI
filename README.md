Spring Boot Task Manager API
About the Project

Spring Boot Task Manager API is a backend application for managing tasks efficiently. It demonstrates skills in Java, Spring Boot, RESTful API development, and PostgreSQL integration. Ideal for showcasing backend development expertise in your GitHub portfolio.

Features

Create, read, update, and delete tasks

RESTful API endpoints returning JSON responses

Exception handling and input validation

PostgreSQL database integration

Easy to run locally for testing or learning

Tech Stack

Language: Java 22

Framework: Spring Boot

Database: PostgreSQL

Build Tool: Maven

Testing: Postman / REST client

Version Control: Git & GitHub

Project Structure
SpringBootTaskManager
 ├─ src
 │   ├─ main
 │   │   ├─ java/com/rohit/taskmanager
 │   │   └─ resources
 │   └─ test
 ├─ pom.xml
 └─ application.properties

API Endpoints
Method	Endpoint	Description
POST	/api/tasks	Create a new task
GET	/api/tasks	Fetch all tasks
GET	/api/tasks/{id}	Fetch a task by ID
PUT	/api/tasks/{id}	Update a task
DELETE	/api/tasks/{id}	Delete a task

Example request body (Create Task):

{
  "title": "Complete README",
  "description": "Write a professional README for GitHub",
  "status": "IN_PROGRESS"
}

How to Run Locally

Clone the repository:

git clone https://github.com/<your-username>/Smart-Task-Manager-API.git


Configure PostgreSQL in application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Make sure you create a database named taskdb in PostgreSQL before running.

Build and run:

mvn clean install
mvn spring-boot:run


Test APIs using Postman or any REST client.

Next Steps / Enhancements

Add JWT-based authentication for secure API access

Integrate Swagger/OpenAPI for API documentation

Dockerize the application for cloud deployment

Portfolio / Resume Impact

This project highlights:

Backend development skills using Java + Spring Boot

REST API design and implementation

Database integration with PostgreSQL

Writing clean, deployable, and professional code.
