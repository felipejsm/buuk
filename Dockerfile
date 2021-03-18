FROM adoptopenjdk/openjdk11:alpine
COPY target/*.jar buuk.0.0.1.jar
ENTRYPOINT ["java","-jar","buuk.0.0.1.jar"]