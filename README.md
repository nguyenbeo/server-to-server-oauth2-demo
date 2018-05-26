# server-to-server-oauth2-demo

An example how to authenticate from access of a server to a API provided server via OAUTH2

# Overview
OAuth is not an API or a service: it’s an open standard for authorization and anyone can implement it.

More specifically, OAuth is a standard that apps can use to provide client applications with “secure delegated access”. OAuth works over HTTPS and authorizes devices, APIs, servers, and applications with access tokens rather than credentials.

# Scenario
In the world of microservice, there is sometimes a requirement that a service (consuming service) needs to communicate with another service (providing service) where an authorization is required in order to give access to the consuming service.

![Alt text](./server-to-server-oauth2.png "Server to server OAUTH2")

# Implementation
* Authorization Server: Use Okta: https://developer.okta.com/
* Resource Server: Spring Boot with Spring Security OAuth enabled.
* Client Server: Spring Boot application running as a Command Line

# Technologies
* Java 8
* Spring Boot
* Maven
* Spring Security OAuth

# How to run
* Register an account on https://developer.okta.com/. Don't forget to activate from your email. You'll get a client_id and client_secret, save them all to configure your Spring-Boot servers.
* Create Application with Service - Machine to machine while creating the application.
* Create scope = "get_user" for the API of Authentication Server.
* Edit the yaml files in spring-boot-client-oauth2/src/main/resources/application.yml and spring-boot-resource-server-oauth2/src/main/resources/application.yml with the client_id, client_secret and access_token_ui with the ones that you recently registered. Take to URL in issuer in Okta.spring-boot-resource-server-oauth2
* Open the terminal
* Run command: "cd spring-boot-resource-server-oauth2"
* Run command: "mvn spring-boot:run -Dhttps.protocols=TLSv1.2,TLSv1.1,TLSv1" to start up the resource server.
* Open another tab in the terminal
* Go to directory: spring-boot-client-oauth2
* Run command: "mvn spring-boot:run -Dhttps.protocols=TLSv1.2,TLSv1.1,TLSv1"

## Expected result:
* If you visit: http://localhost:8080/user, you'll get 401 http status as response.
* The log of spring-boot-client-oauth2 will contain:
"2018-05-26 21:02:01.227  INFO 5163 --- [main] .m.o.s.SpringBootClientOauth2Application : Authorized User: User [name=Nguyen Binh Nguyen, position=Co-Founder, company=MiKKa Consuting, url=http://mikka.se, bio=A senior software engineer]"
