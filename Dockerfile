#FROM maven:3.6.3-jdk-11 as build
#WORKDIR /buildApp
#COPY . .
#RUN mvn clean package
FROM adoptopenjdk/openjdk11:alpine-slim
ARG JAR_FILE=infrastructure/target/infrastructure-1.0-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENV SERVER_PORT=2222
ENTRYPOINT ["java","-jar","app.jar"]