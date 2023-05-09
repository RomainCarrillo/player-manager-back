
FROM openjdk:11.0.11-jre-slim
COPY target/player-manager-0.0.2-SNAPSHOT.jar player-manager-0.0.2-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/player-manager-0.0.2-SNAPSHOT.jar" ]
