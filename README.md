#User Micro Service
This repository contains various example microservices developed in line with  the microservices architecture. The code in the repository is for `Department Microservice`. The code demonstrates the CRUD actions performed on User resource.

The Microservice uses embedded `H2 database` to cut down the complexity but you can use your own db of choice. The Micro service connects to `Eureka server` on port 8761 and also connects to a [Zipkin server](https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec) server for logs tracing at port 9411.

The application uses slf4j for logging.

For the service to be registered with Eureka server make sure Eureka server is started.


## Requirements

For building and running the application you need:

- [JDK 1.8 and above](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)



## Building and running microservices locally

We can run the appplication locally in multiple ways on your local machine.

One way is by running the `main` method of `com.practice.user.UserApplication` as a java application. This will start the server on port 9001.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```




