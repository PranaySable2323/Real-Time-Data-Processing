# Base image
FROM openjdk:11-jre-slim

# Add application JAR
COPY target/weather-monitoring-backend-0.0.1-SNAPSHOT.jar /weather-app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "/weather-app.jar"]
