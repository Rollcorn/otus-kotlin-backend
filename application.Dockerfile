# Use a base image with a Java runtime environment
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /financial-helper

# Copy the Gradle build files to the container
COPY build.gradle.kts settings.gradle.kts gradlew /financial-helper/
COPY gradle /financial-helper/gradle

# Copy the source code to the container
COPY m1l1-init /financial-helper/m1l1-init

# Set the Kotlin version in the Docker build arguments
ARG KOTLIN_VERSION="1.7.20"

# Build the application using Gradle and pass the Kotlin version as a build argument
RUN ./gradlew build -PkotlinVersion=$KOTLIN_VERSION --no-daemon

# Expose the port on which your application listens
EXPOSE 5055

# Specify the command to run your application
CMD ["java", "-jar", "m1l1-init/build/libs/m1l1-init-1.0-SNAPSHOT.jar"]
