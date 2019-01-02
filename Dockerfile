FROM openjdk:12-jdk-alpine
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar target/demo.jar
ENTRYPOINT ["java","-jar","target/demo.jar"]