FROM public.ecr.aws/lambda/java:17 as BUILD
COPY target/classes ${LAMBDA_TASK_ROOT}
COPY target/dependency/* ${LAMBDA_TASK_ROOT}/lib/
CMD ["org.drivemybox.interview.StreamLambdaHandler::handleRequest"]

# Old version not inteded for AWS lambda, and on Java 11, and SpringBoot 2
#FROM maven:3.6.3-openjdk-11 as BUILD
#WORKDIR /build/
#COPY pom.xml /build/
#COPY src /build/src
#
#RUN mvn clean package
#
#FROM openjdk:11 as RUN
#WORKDIR /app/
#COPY --from=BUILD /build/target/drivemybox-interview.jar /app/application.jar
#
#ENTRYPOINT ["java","-jar","application.jar"]
