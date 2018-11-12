FROM openjdk:8
ADD target/carcal-spring-boot.jar carcal-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "carcal-spring-boot.jar"]