FROM adoptopenjdk/openjdk11:alpine-slim
RUN ls -la
WORKDIR /my-workdir
COPY social-network-rest/target/social-network-rest-1.0-SNAPSHOT.jar app.jar
RUN ls -la
#ENV SERVER_PORT=2222
ENTRYPOINT ["java","-jar","app.jar"]