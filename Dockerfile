# Use OpenJDK 11 as base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Spring Boot jar file into the container
COPY build/libs/demo3-0.0.1-SNAPSHOT.jar /app/demo3.jar

# Expose the port on which your Spring Boot application runs
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "demo3.jar"]