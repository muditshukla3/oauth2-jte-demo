
# OAuth2 JTE Demo

This sample project demonstrates how to integrate Spring Boot with Spring Security, OAuth2, and JTE (Java Template Engine).

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Clone the Repository](#clone-the-repository)
    - [Configure OAuth2 Client Credentials](#configure-oauth2-client-credentials)
    - [Run the Application](#run-the-application)
- [Usage](#usage)
    - [Login with GitHub](#login-with-github)
    - [Access Protected Resources](#access-protected-resources)
- [License](#license)

## Introduction

This project showcases how to secure a Spring Boot application using OAuth2 for authentication and authorization, and JTE for dynamic template rendering. It integrates GitHub as the OAuth2 provider and demonstrates how to protect different endpoints with different authorization rules.

## Features

- OAuth2 authentication with GitHub
- Authorization based on GitHub user roles
- Dynamic template rendering using JTE
- Custom error handling for unauthorized access

## Prerequisites

- Java 17 or above
- Maven
- GitHub account for OAuth2 configuration

## Getting Started

### Clone the Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/your-username/oauth2-jte-demo.git
```

### Configure OAuth2 Client Credentials

To enable OAuth2 authentication with GitHub, you need to create a GitHub OAuth2 application and obtain the client ID and secret. Follow these steps:

1. Go to [GitHub Developer Settings](https://github.com/settings/developers) and click on "OAuth Apps".
2. Click on "New OAuth App" and fill in the required fields:
    - Application name: `OAuth2 JTE Demo`
    - Homepage URL: `http://localhost:8080`
    - Authorization callback URL: `http://localhost:8080/login/oauth2/code/github`
3. After creating the application, you will be redirected to the application's settings page. Copy the "Client ID" and "Client Secret" values.
4. Open the `application.yml` file in your project and add the following properties:

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            client-id: YOUR_GITHUB_CLIENT_ID
            client-secret: YOUR_GITHUB_CLIENT_SECRET
```

Replace `YOUR_GITHUB_CLIENT_ID` and `YOUR_GITHUB_CLIENT_SECRET` with the values you obtained from GitHub.

### Run the Application

To run the application, execute the following command in the project directory:

```bash
mvn spring-boot:run
```

The application will start on port 8080.

## Usage
### Login with default credentials

Login with an in memory credentials admin/admin123.
### Login with GitHub

Access the application at `http://localhost:8080`. You will be redirected to GitHub to login. After successful authentication, you will be redirected back to the application.
