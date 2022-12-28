# Cinema App

Cinema App is a Java based web application that allows users to browse and purchase tickets for movies. It is developed using Spring framework and uses Spring Security for authentication and authorization. The database is managed using Hibernate ORM. My project is using 3-layer architecture and following SOLID principles.

<!-- TOC -->
* [Cinema App](#cinema-app)
    * [Features](#features)
    * [Used Technologies](#used-technologies)
    * [Set-up and Running the Project](#set-up-and-running-the-project)
* [UML Diagram](#uml-diagram)
<!-- TOC -->

### Features

- Browse movie listings and showtimes
- Purchase tickets for specific showings
- Create an account and log in to access saved tickets and purchase history
- Admin users can add, edit, and delete movies and showtimes

### Used Technologies

| Name            | ver.      |
|-----------------|-----------|
| Java            | `17.0.4`  |
| Apache Tomcat   | `9.0.69`  |
| Maven           | `3.8.6`   |
| Spring Core/MVC | `5.3.20`  |
| Spring Security | `5.6.10`  |
| Hibernate       | `5.6.14`  |

### Set-up and Running the Project

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (Eclipse, IntelliJ, etc.).
3. Set up a local MySQL database and update the database configuration in the `db.properties` file.
4. Import all the required dependencies (Reload All Maven Projects).
5. Configure tomcat
6. Run the project and go to http://localhost:8080 in your web browser.
7. To access the application you may log in with following credentials (configurable in the `DataInitializer` class):
   - Username: `admin@i.ua`
   - Password: `admin123`

# UML Diagram

![](https://i.imgur.com/0rNffBY.png)
