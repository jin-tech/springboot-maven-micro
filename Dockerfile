# FROM java:8
# COPY target/springboot-maven-course-micro-svc-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
# Use a more specific and up-to-date base image
FROM openjdk:8-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the WAR file into the container
COPY target/springboot-maven-micro.war /app/springboot-maven-micro.war

# Expose the port on which the application will run
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/springboot-maven-micro.war"]
