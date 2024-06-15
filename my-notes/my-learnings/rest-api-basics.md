## REST: REpresentational State Transfer
- State means Data
- Representation means formats (such as xml, html, json, yaml)
- Transfer means carrying data between consumer and provider using HTTP protocol
## REST Architectural Constraints
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
## REST Key Concepts:
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
## HTTP Methods
  - **GET**: To get a collection or single resource
  - **POST**: To create a new resource
  - **PUT** or **PATCH**: To update an existing resource<br>
    PUT is used to update complete entity. We have to provide all the properties in request payload.<br>
    PATCH is used to update specific properties of an entity. Only those properties need to be specified.
  - **DELETE**: To delete a collection or a single resource
## HTTP Status Codes
  - **200 OK**: Indicates that the request is successful and the response content is returned to the client as appropriate.
  - **201 Created**: Indicates that the request is successful and a new resource is created.
  - **202 Accepted**: Request been accepted for processing but the processing has not yet been completed.
  - **400 Bad Request**: The server failed to process request due to malformed syntax in the request.
  - **401 Unauthorized**: It indicates that authentication is required for the resource.
  - **403 Forbidden**: It indicates that you are not allowed to access the resource.
  - **404 Not Found**: It indicates that the requested resource is not found at the location specified in the request.
  - **500 Internal Server Error**: It indicates a generic error message and it tells that an unexpected error occurred on the server side and the request cannot be fulfiled.
