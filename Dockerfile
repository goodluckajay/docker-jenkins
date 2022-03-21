FROM openjdk:8
EXPOSE 8081
ADD target/docker-jenkins-0.0.1-SNAPSHOT.jar docker-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-0.0.1-SNAPSHOT.jar"]
