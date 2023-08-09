# Customer_Service_Messaging_web_app
A messaging web app built using Spring Boot. Allows customers to send queries via API, agents to respond in real-time, and keeps track of conversations. Multi-user login, user-friendly interface, and efficient message management.

## Features

- User-friendly interface for both customers and agents.
- Multi-user login system for agents.
- Efficient messaging functionality for instant communication.
- Message tracking and management for agents to streamline responses.

## Technologies Used

- Spring Boot: Backend framework for building the application.
- Thymeleaf: Templating engine for rendering HTML templates.
- MySQL: Database for storing user messages and agent responses.

## Getting Started

Follow these steps to get the StreamLine Messaging Web App up and running:

1. Clone this repository to your local machine:

2. Configure your MySQL database connection in `src/main/resources/application.properties`:
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

3. Build and run the application using Maven:
cd streamline-messaging-web-app
mvn spring-boot:run

4. Access the application through a web browser at `http://localhost:8080`.


### Usage for Users

1. Access the web application at `http://localhost:8080`.
2. Send messages to agents using the provided interface or API endpoint.
3. View responses from agents.
   
## User Perspective
    localhost:8080/user/
    localhost:8080/user/dashboard

## Agent Perspective
    localhost:8080/agent/dashboard
    
### Usage for Agents

1. Access the web application at `http://localhost:8080`.
2. Log in as an agent using your credentials.
3. View incoming messages from customers.
4. Respond to customer messages efficiently.
5. Track and manage conversations with customers.
