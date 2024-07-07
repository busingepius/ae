# DOCUMENTATION
#### Swagger API Documentation
[API DOCS-REMOTE](https://books-1-0.onrender.com/swagger-ui/index.html)

[API DOCS-LOCAL](http://localhost:8080/swagger-ui.html)

[READ ABOUT OPENAPI](https://www.baeldung.com/spring-rest-openapi-documentation)

#### Gradle Build Tool
- Run `./gradlew build` to build the project and package it into a JAR file in `/build/libs` directory
- Run `./gradlew bootRun` to run the project normally without packaging it into a JAR file
- Run `java -jar build/libs/PROJECT_NAME-0.0.1-SNAPSHOT.jar` to run the project from the JAR file

    #### Docker 
    - Create docker file in the root directory
    - Add the following code to the docker file
    ```
    FROM azul/zulu-openjdk-alpine:21
    VOLUME /tmp
    COPY build/libs/*.jar app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]
    ```
    - Run `docker build -t PROJECT_NAME .` to build the docker image
  

#### Maven Build Tool
- Run `mvn clean package` to build the project and package it into a JAR file in `/target` directory
- Run `mvn spring-boot:run` to run the project normally without packaging it into a JAR file
- Run `java -jar target/PROJECT_NAME-0.0.1-SNAPSHOT.jar` to run the project from the JAR file
    
    #### Docker 
    - Create docker file in the root directory
    - Add the following code to the docker file
    ```
    FROM eclipse-temurin:21-jdk-alpine
    VOLUME /tmp
    COPY target/*.jar app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]
    ```
    - Run `docker build -t PROJECT_NAME .` to build the docker image

#### General Docker advice 
Create an account on docker hub, and then create a new repository. 
Then run the following commands to push the image to docker hub
```
docker login
docker tag PROJECT_NAME DOCKER_HUB_USERNAME/REPOSITORY_NAME:TAG
docker push DOCKER_HUB_USERNAME/REPOSITORY_NAME:TAG
```

## RENDER NOTICE
```
Your free instance will spin down with inactivity, which can delay requests by 50 seconds or more.
```
