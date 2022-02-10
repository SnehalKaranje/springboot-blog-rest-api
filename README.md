# springboot-blog-rest-api
<a href="https://maven.apache.org/"><img alt="maven" src="https://img.shields.io/badge/maven-%20-blue"/></a>
<a href="https://spring.io/projects/spring-boot/"><img alt="Spring Boot" src="https://img.shields.io/badge/SpringBoot-2.6.3-blue"/></a>
<a href="https://docs.oracle.com/en/java/javase/11/"><img alt="Java 11" src="https://img.shields.io/badge/Java-11-blue"/></a>
<a href="https://dev.mysql.com/"><img alt="MySQL" src="https://img.shields.io/badge/MySQL-8.0.28-blue"/></a>

## Dependencies
Dependencies used are as follows:
- <a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web"><img alt="spring-boot-starter-web" src="https://img.shields.io/badge/dependency-SpringBootStarterWeb-blue"/></a> To build web applications as well as RESTful web services. Internally uses Apache Tomcat as default web container
- <a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa"><img alt="spring-boot-starter-data-jpa" src="https://img.shields.io/badge/dependency-SpringBootStarterDataJPA-blue"/></a> To communicate with database. Abstraction above JPA and internally uses Hibernate JPA provider.
- <a href="https://mvnrepository.com/artifact/mysql/mysql-connector-java"><img alt="mysql-connector-java" src="https://img.shields.io/badge/dependency-MySQLConnectorJava-blue"/></a> To interact with MySQL database from Java Application.
- <a href="https://mvnrepository.com/artifact/org.projectlombok/lombok"><img alt="lombok" src="https://img.shields.io/badge/dependency-Lombok-blue"/></a> Annotation library that helps to reduce boiler plate code like getters, setters, constructors, toSting etc.
- <a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools"><img alt="spring-boot-devtools" src="https://img.shields.io/badge/dependency-SpringBootDevTools-blue"/></a> Any change in spring boot application doesn't require re-start
- <a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test"><img alt="spring-boot-starter-test" src="https://img.shields.io/badge/dependency-SpringBootStarterTest-blue"/></a> Starter for testing Spring Boot applications with libraries including JUnit Jupiter, Hamcrest and Mockito
- <a href="https://mvnrepository.com/artifact/org.modelmapper/modelmapper/3.0.0"><img alt="model-mapper" src="https://img.shields.io/badge/dependency-ModelMapper-blue"/></a> Refactoring safe object mapping library that automatically maps objects to each other


## Project Architecture Explained
3 layer Architecture
TODO: add spring boot project architecture diagram
Postman Client <--> Controller <--> Service <--> DAO <--> DB
- Controller
  - Keeps all spring REST controllers
  - Define end points
- Service
  - all service class that hold business logic
- DAO
  - Repository layer
  - keep all spring JPA data repository
  - Communicates with database


## Project Structure Explained
- controller
  - Contains all Spring MVC controllers
- entity
  - Contains all JPA entities
- service
  - Contains service interfaces
- service.impl
  - Contains servie classes
- utils
  - Contains utilities and classes
- repository
  - Contains Spring Data JPA repositories. (JPA repositories are by default Transactional. Default implementation class of the JpaRepository interface is SimpleJpaRepository class)
- exception
  - Contains all custom exceptions
- payload
  - Contains DTOs (Data Transfer Objects) that act as a payload between client and server


## Annotations
### Spring Boot Annotations
- <a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/using-boot-using-springbootapplication-annotation.html"><img alt="SpringBootApplication" src="https://img.shields.io/badge/@SpringBootApplication-blue"/></a> Marks entry point of spring application.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseStatus.html"><img alt="ResponseStatus" src="https://img.shields.io/badge/@ResponseStatus-blue"/></a> Cause spring boot to respond with the specified HTTP status code whenever this exception is thrown from controller.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html"><img alt="Service" src="https://img.shields.io/badge/@Service-blue"/></a> Indicates that the class is a service class / component. It is available for auto-detection while component scanning. Service class can be injected (autowired) in other classes.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html"><img alt="RestController" src="https://img.shields.io/badge/@RestController-blue"/></a> Used to create RESTful web services using Spring MVC. It internally uses <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html"><img alt="Controller" src="https://img.shields.io/badge/@Controller-blue"/></a> annotation to convert java object to json. It is a combination of <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html"><img alt="Controller" src="https://img.shields.io/badge/@Controller-blue"/></a> and <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseBody.html"><img alt="ResponseBody" src="https://img.shields.io/badge/@ResponseBody-blue"/></a> annotations.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a> The class-level annotation maps a specific request path or pattern onto a controller.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PostMapping.html"><img alt="PostMapping" src="https://img.shields.io/badge/@PostMapping-blue"/></a> Used to annotate handler method to handle HTTP POST request. Combination of <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a> annotation and Request method 'post'.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html"><img alt="GetMapping" src="https://img.shields.io/badge/@GetMapping-blue"/></a> Used to annotate handler method to handle HTTP GET request. Combination of <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a> annotation and Request method 'get'.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html"><img alt="PathVariable" src="https://img.shields.io/badge/@PathVariable-blue"/></a> Bind url template variable into method argument.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html"><img alt="PutMapping" src="https://img.shields.io/badge/@PutMapping-blue"/></a> Used to annotate handler method to handle HTTP PUT request. Combination of <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a> annotation and Request method 'put'.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/DeleteMapping.html"><img alt="DeleteMapping" src="https://img.shields.io/badge/@DeleteMapping-blue"/></a> Used to annotate handler method to handle HTTP DELETE request. Combination of <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a> annotation and Request method 'delete'.
- <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html"><img alt="RequestParam" src="https://img.shields.io/badge/@RequestParam-blue"/></a> Makes Spring to map request parameters from the GET/POST request to method argument.
- <a href="https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s"><img alt="Bean" src="https://img.shields.io/badge/@Bean-blue"/></a>This annotation tells that a method produces a bean to be managed by the Spring container. It is a method-level annotation. During Java configuration ( @Configuration ), the method is executed and its return value is registered as a bean within a BeanFactory.


### Lombok annotations
- <a href="https://projectlombok.org/api/lombok/Data.html"><img alt="Data" src="https://img.shields.io/badge/@Data-blue"/></a> Generates getters, setters, toString, hashCode, equals at runtime. Equivalent to **{@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode}.**
- <a href="https://projectlombok.org/api/lombok/AllArgsConstructor.html"><img alt="AllArgsConstructor" src="https://img.shields.io/badge/@AllArgsConstructor-blue"/></a> Generates all argument constructor.
- <a href="https://projectlombok.org/api/lombok/NoArgsConstructor.html"><img alt="NoArgsConstructor" src="https://img.shields.io/badge/@NoArgsConstructor-blue"/></a> Generates no argument constructor.

### JPA annotations
- <a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Entity"><img alt="Entity" src="https://img.shields.io/badge/@Entity-blue"/></a>, <a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Table"><img alt="Table" src="https://img.shields.io/badge/@Table-blue"/></a> (To map JPA entity with MySQL tables. If @Table annotation is not given then table with className is created.)
- <a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Id"><img alt="Id" src="https://img.shields.io/badge/@Id-blue"/></a> Define primary key of entity
- <a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#GeneratedValue"><img alt="GeneratedValue" src="https://img.shields.io/badge/@GeneratedValue-blue"/></a> To provide primary key genration strategy.
- <a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Column"><img alt="Column" src="https://img.shields.io/badge/@Column-blue"/></a> Optional annotation. Can be used to provide column name to the table. If not added, JPA will consider property name as column name of the table.
- @ManyToOne
- @JoinColumn
- @OneToMany