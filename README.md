# springboot-blog-rest-api
maven project, spring boot 2.6.3, java 11
# Dependencies
Spring dependencies used are as follows:
- Spring Web (Use to build web applications as well as RESTful web services. Internally uses Apache Tomcat as default web container.)
- Spring Data JPA (Communicate with database, Abstraction above JPA and internally uses Hibernate JPA provider)
- MySQL Driver (Interact with database from Java Application)
- Lombok (Annotation library that helps to reduce boiler plate code like getters, setters, constructors, toSting etc.)
- Spring Boot DevTools (Any change in spring boot application doesn't require re-start)

# Project Architecture Explained
3 layer Architecture
TODO: add spring boot project architecture diagram
Postman Client <--> Controller <--> Service <--> DAO <--> DB
- Controller (Keeps all spring REST controllers, Define end points)
- Service (all service class that hold business logic)
- DAO (Repository layer, keep all spring JPA data repository, Communicates with database)

# Project Structure Explained
- controller (Contains all Spring MVC controllers)
- entity (Contains all JPA entities)
- service (Contains service interfaces)
- service.impl (Contains servie classes)
- utils (Contains utilities and classes)
- repository (Contains Spring Data JPA repositories)
- exception (Contains all custom exceptions)
