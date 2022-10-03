FROM openjdk:11
EXPOSE 8080
ADD ./target/client-ip-0.0.1-SNAPSHOT.jar client-ip-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "client-ip-0.0.1-SNAPSHOT.jar"]
