#FROM openjdk:10-jdk-slim
#FROM  eclipse-temurin:17-jdk-alpine
FROM openjdk:17

#RUN mkdir "/opt/keerti"

Add "target/parent-0.0.1-SNAPSHOT.jar", "/opt/keerti/parent-0.0.1-SNAPSHOT.jar"

ENV JAVA_OPTS= "-Xms2g -Xmx4g"

ENTRYPOINT ["java", "-jar", "/opt/keerti/parent-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081
