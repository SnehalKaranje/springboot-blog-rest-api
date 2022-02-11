# springboot-blog-rest-api
<a href="https://maven.apache.org/"><img alt="maven" src="https://img.shields.io/badge/maven-%20-blue"/></a>
<a href="https://spring.io/projects/spring-boot/"><img alt="Spring Boot" src="https://img.shields.io/badge/SpringBoot-2.6.3-blue"/></a>
<a href="https://docs.oracle.com/en/java/javase/11/"><img alt="Java 11" src="https://img.shields.io/badge/Java-11-blue"/></a>
<a href="https://dev.mysql.com/"><img alt="MySQL" src="https://img.shields.io/badge/MySQL-8.0.28-blue"/></a>


## Dependencies
Dependencies used are as follows:

<a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web"><img alt="spring-boot-starter-web" src="https://img.shields.io/badge/dependency-SpringBootStarterWeb-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa"><img alt="spring-boot-starter-data-jpa" src="https://img.shields.io/badge/dependency-SpringBootStarterDataJPA-blue"/></a>
<a href="https://mvnrepository.com/artifact/mysql/mysql-connector-java"><img alt="mysql-connector-java" src="https://img.shields.io/badge/dependency-MySQLConnectorJava-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.projectlombok/lombok"><img alt="lombok" src="https://img.shields.io/badge/dependency-Lombok-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools"><img alt="spring-boot-devtools" src="https://img.shields.io/badge/dependency-SpringBootDevTools-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test"><img alt="spring-boot-starter-test" src="https://img.shields.io/badge/dependency-SpringBootStarterTest-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.modelmapper/modelmapper/3.0.0"><img alt="model-mapper" src="https://img.shields.io/badge/dependency-ModelMapper-blue"/></a>
<a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation"><img alt="spring-boot-starter-validation" src="https://img.shields.io/badge/dependency-SpringBootStarterValidation-blue"/></a> 


## Project Architecture
3 layer Architecture : Client <--> Controller <--> Service <--> DAO <--> DB

- Controller
  - Keeps all spring REST controllers
  - Define end points
- Service
  - all service classes that hold business logic
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
<a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/using-boot-using-springbootapplication-annotation.html"><img alt="SpringBootApplication" src="https://img.shields.io/badge/@SpringBootApplication-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseStatus.html"><img alt="ResponseStatus" src="https://img.shields.io/badge/@ResponseStatus-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html"><img alt="Service" src="https://img.shields.io/badge/@Service-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html"><img alt="RestController" src="https://img.shields.io/badge/@RestController-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html"><img alt="Controller" src="https://img.shields.io/badge/@Controller-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseBody.html"><img alt="ResponseBody" src="https://img.shields.io/badge/@ResponseBody-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html"><img alt="RequestMapping" src="https://img.shields.io/badge/@RequestMapping-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PostMapping.html"><img alt="PostMapping" src="https://img.shields.io/badge/@PostMapping-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html"><img alt="GetMapping" src="https://img.shields.io/badge/@GetMapping-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html"><img alt="PathVariable" src="https://img.shields.io/badge/@PathVariable-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html"><img alt="PutMapping" src="https://img.shields.io/badge/@PutMapping-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/DeleteMapping.html"><img alt="DeleteMapping" src="https://img.shields.io/badge/@DeleteMapping-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html"><img alt="RequestParam" src="https://img.shields.io/badge/@RequestParam-blue"/></a>
<a href="https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s"><img alt="Bean" src="https://img.shields.io/badge/@Bean-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ExceptionHandler.html"><img alt="ExceptionHandler" src="https://img.shields.io/badge/@ExceptionHandler-blue"/></a>
<a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ControllerAdvice.html"><img alt="ControllerAdvice" src="https://img.shields.io/badge/@ControllerAdvice-blue"/></a>

### Lombok annotations
<a href="https://projectlombok.org/api/lombok/Data.html"><img alt="Data" src="https://img.shields.io/badge/@Data-blue"/></a>
<a href="https://projectlombok.org/api/lombok/AllArgsConstructor.html"><img alt="AllArgsConstructor" src="https://img.shields.io/badge/@AllArgsConstructor-blue"/></a>
<a href="https://projectlombok.org/api/lombok/NoArgsConstructor.html"><img alt="NoArgsConstructor" src="https://img.shields.io/badge/@NoArgsConstructor-blue"/></a>

### JPA annotations
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Entity"><img alt="Entity" src="https://img.shields.io/badge/@Entity-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Table"><img alt="Table" src="https://img.shields.io/badge/@Table-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Id"><img alt="Id" src="https://img.shields.io/badge/@Id-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#GeneratedValue"><img alt="GeneratedValue" src="https://img.shields.io/badge/@GeneratedValue-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#Column"><img alt="Column" src="https://img.shields.io/badge/@Column-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#ManyToOne"><img alt="ManyToOne" src="https://img.shields.io/badge/@ManyToOne-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#JoinColumn"><img alt="JoinColumn" src="https://img.shields.io/badge/@JoinColumn-blue"/></a>
<a href="https://www.techferry.com/articles/hibernate-jpa-annotations.html#OneToMany"><img alt="OneToMany" src="https://img.shields.io/badge/@OneToMany-blue"/></a>

### Spring Boot starter validation (Hibernate Validator)
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/constraints/NotNull.html"><img alt="NotNull" src="https://img.shields.io/badge/@NotNull-blue"/></a>
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/constraints/Size.html"><img alt="Size" src="https://img.shields.io/badge/@Size-blue"/></a>
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/constraints/Min.html"><img alt="Min" src="https://img.shields.io/badge/@Min-blue"/></a>
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/constraints/Max.html"><img alt="Max" src="https://img.shields.io/badge/@Max-blue"/></a>
<a href="https://javaee.github.io/javaee-spec/javadocs/javax/validation/constraints/Email.html"><img alt="Email" src="https://img.shields.io/badge/@Email-blue"/></a>
<a href="https://javaee.github.io/javaee-spec/javadocs/javax/validation/constraints/NotEmpty.html"><img alt="NotEmpty" src="https://img.shields.io/badge/@NotEmpty-blue"/></a> 
<a href="https://javaee.github.io/javaee-spec/javadocs/javax/validation/constraints/NotBlank.html"><img alt="NotBlank" src="https://img.shields.io/badge/@NotBlank-blue"/></a> 
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/Valid.html"><img alt="Valid" src="https://img.shields.io/badge/@Valid-blue"/></a>
