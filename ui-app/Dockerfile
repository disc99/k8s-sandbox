FROM frolvlad/alpine-oraclejdk8:slim

ADD build/libs/*.jar app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
