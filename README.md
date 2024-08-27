# Personnel Management System

## Project Overview

This project is a simple web application developed using Java, Spring Boot, and Vaadin. It demonstrates a basic employee management system where users can view and search for employee information. The application is built with a modern UI framework (Vaadin) that allows for a smooth and responsive user experience.

## Features

- View a list of employees.
- Search functionality to filter employees by name.
- About page providing information about the application.

## Technologies Used

- **Java 17**: The programming language used for backend development.
- **Spring Boot**: A framework to create stand-alone, production-grade Spring-based applications.
- **Vaadin**: A web application framework that allows developers to build modern web applications in Java.
- **Maven**: A build automation tool used for managing project dependencies.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 17 installed on your machine.
- Maven installed for dependency management.
- An IDE such as IntelliJ IDEA for development.

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/monad-task.git
   cd monad-task
   ```

2. **Build the project**:

   Use Maven to build the project:

   ```bash
   mvn clean install
   ```

3. **Run the application**:

   You can run the application using the following command:

   ```bash
   mvn spring-boot:run
   ```

   Alternatively, you can run it from your IDE.

4. **Access the application**:

   Open your web browser and navigate to `http://localhost:8080` to access the application.

### Usage

- **Viewing Employees**: Navigate to the "Personel" page to view the list of employees.
- **Searching Employees**: Use the search field to filter employees by their names.
- **About Page**: Navigate to the "About" page to learn more about the application.

## Project Structure

The project structure is organized as follows:

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── application/
│   │   │               ├── data/
│   │   │               │   └── Personel.java
│   │   │               ├── services/
│   │   │               │   └── PersonelService.java
│   │   │               ├── views/
│   │   │               │   ├── about/
│   │   │               │   │   └── AboutView.java
│   │   │               │   ├── helloworld/
│   │   │               │   │   └── HelloWorldView.java
│   │   │               │   └── personel/
│   │   │               │       └── PersonelView.java
│   │   │               └── Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```
