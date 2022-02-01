# springboot-blog-rest-api
<a href="https://maven.apache.org/"><img alt="maven" src="https://img.shields.io/badge/maven-blue"/></a>
<a href="https://spring.io/projects/spring-boot/"><img alt="Spring Boot" src="https://img.shields.io/badge/SpringBoot-2.6.3-blue"/></a>
<a href="https://docs.oracle.com/en/java/javase/11/"><img alt="Java 11" src="https://img.shields.io/badge/Java-11-blue"/></a>
<a href="https://dev.mysql.com/"><img alt="MySQL" src="https://img.shields.io/badge/MySQL-8.0.28-blue"/></a>

## Dependencies
Spring dependencies used are as follows:
- Spring Web (Use to build web applications as well as RESTful web services. Internally uses Apache Tomcat as default web container.)
- Spring Data JPA (Communicate with database, Abstraction above JPA and internally uses Hibernate JPA provider)
- MySQL Driver (Interact with database from Java Application)
- Lombok (Annotation library that helps to reduce boiler plate code like getters, setters, constructors, toSting etc.)
- Spring Boot DevTools (Any change in spring boot application doesn't require re-start)

## Project Architecture Explained
3 layer Architecture
TODO: add spring boot project architecture diagram
Postman Client <--> Controller <--> Service <--> DAO <--> DB
- Controller (Keeps all spring REST controllers, Define end points)
- Service (all service class that hold business logic)
- DAO (Repository layer, keep all spring JPA data repository, Communicates with database)

## Project Structure Explained
- controller (Contains all Spring MVC controllers)
- entity (Contains all JPA entities)
- service (Contains service interfaces)
- service.impl (Contains servie classes)
- utils (Contains utilities and classes)
- repository (Contains Spring Data JPA repositories. (JPA repositories are by default Transactional. Default implementation class of the JpaRepository interface is SimpleJpaRepository class))
- exception (Contains all custom exceptions)
- payload (Contains DTOs (Data Transfer Objects) that act as a payload between client and server)

## Annotations
### Spring Boot Annotations
- @SpringBootApplication (Marks entry point of spring application)
- @ResponseStatus (Cause spring boot to respond with the specified HTTP status code whenever this exception is thrown from controller)
- @Service (Indicates that the class is a service class / component. It is available for auto-detection while component scanning. Can be injected (autowired) in other classes)
- @RestController (Used to create RESTful web services using Spring MVC. It internally uses @Controller annotation to convert java object to json. It is a combination of @Controller and @ResponseBody annotations.)
- @RequestMapping (The class-level annotation maps a specific request path or pattern onto a controller. )
- @PostMapping (Used to annotate handler method to handle HTTP POST request. Combination of @RequestMapping annotation and Request method 'post'.)
- @GetMapping (Used to annotate handler method to handle HTTP GET request. Combination of @RequestMapping annotation and Request method 'get'.)
- @PathVariable (Bind url template variable into method argument)
- @PutMapping (Used to annotate handler method to handle HTTP PUT request. Combination of @RequestMapping annotation and Request method 'put')
- @DeleteMapping (Used to annotate handler method to handle HTTP DELETE request. Combination of @RequestMapping annotation and Request method 'delete')
-@RequestParam (makes Spring to map request parameters from the GET/POST request to method argument.)

### Lombok annotations
- @Data (Generates getters, setters, toString, hashCode, equals at runtime. Equivalent to {@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode})
- @AllArgsConstructor (Generates all argument constructor)
- @NoArgsConstructor (Generates no argument constructor)

### JPA annotations
- @Entity, @Table (To map JPA entity with MySQL tables. If @Table annotation is not given then table with className is created.)
- @Id (Define primary key of entity)
- @GeneratedValue (To provide primary key genration strategy)
- @Column (Optional annotation. Can be used to provide column name to the table. If not added, JPA will consider property name as column name of the table)
