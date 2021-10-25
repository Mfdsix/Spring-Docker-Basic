FROM openjdk:17.0-jdk
COPY target/demo-0.0.1-SNAPSHOT.jar /app/spring-docker.jar
CMD ['java', '-jar', '/app/spring-docker.jar']