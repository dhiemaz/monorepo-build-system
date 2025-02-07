# Monorepo sample project

This is monorepo layout for build system using springboot and gradle. 

In this layout there are 4 subprojects:

------------------------------------------------------------
Root project 'sample-monorepo'
------------------------------------------------------------

Root project 'sample-monorepo'
+--- Project ':catalog'
+--- Project ':member'
+--- Project ':payment'
\--- Project ':transaction'


* The original package name 'com.sample.app.sample-monorepo' is invalid and this project uses 'com.sample.app.sample_monorepo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.2/gradle-plugin/packaging-oci-image.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.4.2/reference/features/dev-services.html#features.dev-services.docker-compose)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/3.4.2/reference/data/nosql.html#data.nosql.redis)

### Guides
The following guides illustrate how to use some features concretely:

* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)
* redis: [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

