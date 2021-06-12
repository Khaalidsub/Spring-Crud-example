#FROM openjdk:16-jdk-alpine as base
#
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

# docker build -t springio/gs-spring-boot-docker .
FROM openjdk:16-jdk-alpine
COPY . .
EXPOSE 8080
ENTRYPOINT ["mvnw", "spring-boot:run"]