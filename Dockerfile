FROM openjdk:17

COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT.jar ./

WORKDIR ./

CMD ["java", "-jar","SPE-Mini-Project-1.0-SNAPSHOT.jar"]