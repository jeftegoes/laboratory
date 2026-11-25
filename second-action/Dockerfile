FROM eclipse-temurin:25-jre

WORKDIR /app

COPY target/java-app-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-cp", "app.jar", "org.example.Main"]