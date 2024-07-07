FROM azul/zulu-openjdk:21
VOLUME /tmp
COPY build/libs/ae-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]