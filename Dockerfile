FROM openjdk:17
EXPOSE 8080
ADD target/devopsassignment.jar devopsassignment.jar
ENTRYPOINT ["java", "-jar", "/devopsassignment.jar"]