# Getting Started

## Prerequisites

* Maven 3.6.3
* Java - openjdk 11
* Docker (if using the Dockerfile)

## Dependencies

* `spring-boot-starter-parent` - Parent pom providing dependency and plugin management for applications built with
  Maven.
* `spring-boot-starter-web` - Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as
  the default embedded container.
* `spring-boot-starter-test` - Starter for testing Spring Boot applications with libraries including JUnit Jupiter,
  Hamcrest and Mockito.
* `spring-boot-autoconfigure` - Automatically configure a Spring application based on the dependencies that are present
  on the classpath.
* `spring-boot-maven-plugin` - Provides Spring Boot support in Apache Maven.

## Configuration parameters

### Greeting service

#### Default greeting service

Enabled by default, or by providing the `greeting.service.type=default` config parameter.

Returns the following message "`<greet>`, `<name>`!" where `name` is a request parameter, and `greet` is a configurable
value. The `greet` is configurable by providing one of the following values
for `greeting.service.default.greet=<value>`:

* `HELLO` (set for prod profile)
* `HEY` (set for test profile)
* `HI` (set for dev profile)

in the `resources/application.properties` file.

The previous values will generate the following messages in order:

* Hello, `<name>`!
* Hey,  `<name>`!
* Hi,  `<name>`!

#### Daytime greeting service

Enabled by providing the `greeting.service.type=daytime` config parameter. Daytime service greets with a
message: "`<greet>`, `<name>`!"
where `greet` is dependent on the time of the day, and `name` is the request parameter.

### Profile

One of the following three profiles can be used by providing the `spring.profiles.active=<profile>` parameter:

* `dev` (this is the default profile used if no other is specified)
* `test`
* `prod`

## IntelliJ (run)

To run the app locally from IntelliJ simply run the `org.drivemybox.interview.InterviewApplication` class with
configuration parameters (environment variables in IntelliJ run configuration) of your choice.

## Maven (build, test and run)

### Build

First ensure you have maven installed with the command `mvn -v`. From the repository root run `mvn install` build the
project into the `target` directory.

### Run

If everything went fine, a .jar should be in the `target` directory. You can run that .jar file with the `java -jar`
command. You can add configuration properties as follows `java -jar target/drivemybox-interview.jar --greeting.service.default.greet=<value>`

### Test

Use the `mvn test` command to run all integration and unit tests.

## Docker (build and run)

Ensure docker is installed by running the
`docker -v` command. First build a docker image with a costum name _drivemybox-interview_ by opening a CMD in the
repository root and running the `sudo docker build -t drivemybox-interview .` command. If the build finished
successfully you should be able to run the docker application with the following command
`sudo docker run -p 8080:8080 -d drivemybox-interview`. Note that `8080:8080` in the previous command can be changed
to `<port>:8080` where `port` can be any available port of your choice where you want the application to listen, while
the second `8080` is the configured Spring Boot application port. Ensure that the application is running in docker with
the following command `sudo docker ps`. When you want to stop the application from running use `sudo docker stop <id>`
where `id` is the one matching your application listed in the `sudo docker ps`
output table. You can choose a profile for the docker application by adding `-e "SPRING_PROFILES_ACTIVE=<profile>"`
to the docker run command, where `profile` is one of `dev, test, prod`.