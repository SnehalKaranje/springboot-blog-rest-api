## What is JWT
- JWT stands for JSON Web Token.
- It is an open standard that is used to securely communicate between client and server.
- It is mostly used for securing REST APIs
- It follows stateless (session information is not stored at server side) authentication mechanism.

## When to use JWT
- Authorization
  - Once user is logged in each sebsequent request includes JWT token.
  - It allows user to access the resources that are allowed to access with that token.
  - Single sign on is a feature that widely uses JWT.
- Information excahnges

## Structure of JWT
- JWT token consists of 3 parts separated by '.':
  - xxxx.yyyy.zzzz
  - header.payload.signature
- Header:
  - Consistes of 2 parts
  - Type of the algorithm being used
  - Type of token which is JWT
- Payload:
  - It contains claims i.e. statement about an entity
- Signature:
  - Base64UrlEncode of header
  - Base64UrlEncode of payload
  - Secret Key
 
  ## How do JWT work
  - Client --> Server    : POST /authenticate with username and password to the server
  - Server               : It validates username and password. If valid, generated JWT token using secret key.
  - Server --> Client    : Server sends generated JWT token to Client
  - Client --> Server    : GET /hello with JWT in header
  - Server               : Validates JWT using secret key
  - Server --> Client    : If JWT token is valid, returns the response.
