# 1. Use a lightweight base image with Java installed
FROM openjdk:17-jdk-alpine

# 2. Set the directory where commands will run
#WORKDIR /opt/keerti
RUN mkdir "/opt/keerti"

RUN mkdir -p "/app/data/tmp"

# 3. Copy your compiled JAR from the host machine to the container
ADD target/parent-0.0.1-SNAPSHOT.jar /opt/keerti/parent-0.0.1-SNAPSHOT.jar

ENV JAVA_OPTS="-Xms2g -Xmx4g"

# 4. Command to start the application
ENTRYPOINT ["java", "-jar", "/opt/keerti/parent-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081
