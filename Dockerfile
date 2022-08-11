FROM openjdk:8

MAINTAINER LiHongBin

ADD target/docker-start-demo-1.0.0.jar app.jar

EXPOSE 18848

ENTRYPOINT ["java", "-jar", "/app.jar"]

