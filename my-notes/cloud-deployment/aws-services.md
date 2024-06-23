## EC2 Service
- Elastic Compute Cloud
- It is a web service that provides secure, resizable compute capacity in the cloud.
- Provides functionality to create virtual server in AWS cloud.
- We can have Java, Tomcat and MySQL servers deployed using EC2.

## Elastic Beanstalk
- It provides complete environment for deploying application.
- It is an easy-to-use service for deploying and scaling web applications and services deployed with Java, Python, .Net, PHP, Node.js, Ruby, Go and Docker on familiar servers such as Apache, Nginx, Passenger, IIS.
- You can simply upload your code and Elastic Beanstalk takes care of:
  - Deployment
  - Capacity provisioning
  - load balancing
  - auto scaling
  - application health monitoring.
- What happens if we don't use elastic beanstalk service:
  - Lot of manual steps required.
  - We need to create EC2 instance and on top of EC2 instance, we need to install Java and Tomcat.
  - Upload all our code in S3 service.
  - We need to set up MySQL in RDS and connect our application to RDS.
- If we use elastic beanstalk service:
  - We don't need to perform all the manual steps mentioned above.
  - Elastic Beanstalk behind the scene creates EC2 instance for us, it will install Java, Tomcat server.
  - It will internally create s3 bucket and store uploaded code in s3.
  - It will internally connect to RDS.

## RDS
- Relational Database Service
- It supports multiple database engines like PostgresSQL, MySQL, Oracle etc.

## Amazon S3
- Simple Storage Service.
- To store and retrieve large amount of data on AWS cloud.
- For instance, to upload jar file or war file on AWS cloud.

## Amazon Route 53
- To configure domain for application.