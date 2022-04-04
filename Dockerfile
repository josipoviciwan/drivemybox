FROM maven:3.6.3-openjdk-11 as BUILD
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src

RUN mvn clean package

FROM openjdk:11 as RUN
WORKDIR /app/
COPY --from=BUILD /build/target/drivemybox-interview.jar /app/application.jar

ENTRYPOINT ["java","-jar","application.jar"]
