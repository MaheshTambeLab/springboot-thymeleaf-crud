# Use a base image with Java 21
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy built JAR into container
COPY target/fabthymeleafcrud-0.0.1-SNAPSHOT.jar app.jar

# Expose your app port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]