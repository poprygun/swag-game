# randomizer-client

Generates API and model classes for Randomizer service using `server` microservice with API generated using [swagger-codegen](https://github.com/swagger-api/swagger-codegen)
config/api-definitions.yml controls Swagger generation.  One can use [Swagger Editor](http://editor.swagger.io/)
to generate, and modify api-definitions.yml

This jar is to be included in services that need to communicate to Randomizer using Feign.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.pivotal.micro-samples</groupId>
    <artifactId>randomizer-client</artifactId>
    <version>X.X.X</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.pivotal.micro-samples:randomizer-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn package
```

Then manually install the following JARs:

* target/randomizer-client-1.0.0.jar
* target/lib/*.jar

Or run

```shell
mvn install
```


