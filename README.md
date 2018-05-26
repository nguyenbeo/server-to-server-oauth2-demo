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
