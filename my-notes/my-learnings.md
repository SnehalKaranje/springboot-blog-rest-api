- REST: REpresentational State Transfer
  - State means Data
  - Representation means formats (such as xml, html, json, yaml)
  - Transfer means carrying data between consumer and provider using HTTP protocol
- REST Architectural Constraints
  - **Client-Server Architecture** <br>
    Client: Frontend <br>
    Server: Backend <br>
    Both are independent of each other
  - **Stateless** <br>
    No data should be stored on the server during processing of the request transfer. <br>
    The state of the session should be stored at client's end.<br> 
  - **Cacheable**<br>
    The client should have ability to store responses in cache.<br>
    This helps improve performance.
  - **Uniform Interface**<br>
    A generic interface to manage all the interactions between the client and server in unified way, which simplifies and decouples the architecture.
  - **Layered System**<br>
    The server can have multiple layers for implementation. <br>
    This helps to improve scalability by enabling load balancing.
  - **Code on demand**<br>
    Optional Constraint.<br>
    It indicates that the functionality of client can be extended at runtime by allowing a code download from the server and executing the code.
- REST Key Concepts:
  - **Resource:** <br>
    A resource is anything you want to expose to the outside world, through your application.<br>
    Example: In case of Student management system, Student, Teacher, Class, Subject, School are the resources.
  - **URI:** <br>
    Uniform Resource Identifier<br>
    We can identify unique resource using URI.<br>
    Example: http://localhost:8080/api/students/ --> Returns all students. Resource: 'student'
  - **Sub-resource:** <br>
    Relationships are modelled by a sub-resource.<br>
    Example: To get List of classes enrolled by a student, URI will be:<br>
    GET /students/{sudentId}/classes --> Classes is a subresource
- HTTP Methods
  - **GET**: To get a collection or single resource
  - **POST**: To create a new resource
  - **PUT** or **PATCH**: To update an existing resource<br>
    PUT is used to update complete entity. We have to provide all the properties in request payload.<br>
    PATCH is used to update specific properties of an entity. Only those properties need to be specified.
  - **DELETE**: To delete a collection or a single resource
- 3 layer Architecture: Client <--> Controller <--> Service <--> DAO <--> DB
- Add new rest API end point flow:
  - [x] DAO Layer
    - Add entity class
    - Add respository class
  - [x] Service Layer
    - Define Interface
    - Implementation
  - [x] Controller Layer
    - Controller class that has all the end points defined
- Can add custom exceptions
- DTO objects
  - Generated for communication between client and server
- Custom Response
  - Default API response can be overridden by creating custom response objects
- Exception Handler
  - In case of exception, API response has some default information like timestamp, status code, exception trace, message, API endpoint etc.
  - This response can be customized as per client requirement by adding exception handler. 
- Hibernate Validator for bean validation
  - For create and update APIs, input provided by user in the request body can be validated as per client requirement using field annotations provided by ```javax.validation.constraints```.
  - We can also provide ```message``` for each annotation to be displayed in case the user input validation fails.
