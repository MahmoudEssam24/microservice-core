# Springboot- Core common jar


Minimal [Spring Boot](http://projects.spring.io/spring-boot/) Common jar.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)


## Generating Core jar into your mvn repository

This jar is used as a common code that is shared between all the microservices. To generate the core jar in the mvn repo, and expose it to all other microservices:

```shell
"<path to project directory>/core/mvnw" clean -f "<path to project directory>/core/pom.xml"
"<path to project directory>/core/mvnw" install -f "<path to project directory>/core/pom.xml"
```

Note:
You can use this if you have Maven installed globally:

```shell
"mvn clean"
"mvn install"
```
