# NewsAPI 

NewsAPI is a RESTful API that provides a list of news articles. It includes JWT-based authentication to secure access to the endpoints. 

## Prerequisites

Before running the project, ensure you have the following installed:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Gradle 8+](https://gradle.org/)
- [Git](https://git-scm.com/)

## Clone the Repository

```sh
 git clone https://github.com/your-username/newsapi.git
 cd newsapi
```

## Build the Project

To compile and build the project, run:

```sh
 ./gradlew build
```

On Windows:

```sh
 gradlew.bat build
```

## Run the Application

To run the application locally, use the following command:

```sh
 ./gradlew bootRun
```

On Windows:

```sh
 gradlew.bat bootRun
```

The application will run on `http://localhost:8080/` by default.

## Configuration

To customize the configuration, edit the `src/main/resources/application.properties` file.

Example configuration in `application.properties`:

```properties
server.port=8081
spring.datasource.url=jdbc:postgresql://localhost:5432/my_database
spring.datasource.username=user
spring.datasource.password=password
```

## Testing

To run tests, use:

```sh
 ./gradlew test
```

## Generate an Executable JAR

You can generate an executable JAR file with:

```sh
 ./gradlew bootJar
```

The generated JAR will be in `build/libs/`.

To run it manually:

```sh
 java -jar build/libs/newsapi-0.0.1-SNAPSHOT.jar
```

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

