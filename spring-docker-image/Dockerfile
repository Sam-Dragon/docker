FROM openjdk:8
EXPOSE 8081
ADD build/libs/spring-docker-image.jar spring-docker-image.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-image.jar"]