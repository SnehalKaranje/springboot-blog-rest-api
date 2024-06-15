## Spring Boot Auto Configuration for Spring Security

- spring-boot-starter-security dependency aggregate spring security related dependencies.
- enables spring security's default configuration, which creates servlet filter as a bean named springSecurityFilterChain.
- Provides default login form for you.
- Creates default user with a
  - username as user
  - password: randomly generated password that is logged to the console.
- Spring boot provides properties to customize default username and password.
- Protects password storage with BCrypt algo.
- Provides logout feature
- CSRF attack protection is enabled by default.
- If Spring Security is on the classpath, Spring Boot automatically secures all HTTP endpoints with "basic" authentication.
- Specific to localhost testing:
  - no url will be accessible without login
  - login url: http://localhost:8080/login
  - logout url: http://localhost:8080/logout
  - this basic form authentication is provided by Spring Security.
- Username and password can be customized using following properties:
  - spring.security.user.name
  - spring.security.user.password
  - spring.security.user.roles

## Basic Authentication using Spring Security

- Since form based authentication is enabled by default, we need to:
  - Generate Security Config Class
  - With SecurityFilterChain bean
  - where we can enable basic authentication.
- In case of basic authentication, username and password are passed in request header