## Deploy application in multiple environments.

- Spring provides profiles to deploy application in multiple environments like Dev, QA, Production.
- Steps:
  - Create multiple application.properties file per profile. For instance, for production environment create application-prod.properties file.
  - In application.properties file
    - Keep common properties.
    - Activate profile by using: spring.profiles.active = prod
    - Rest of the properties that are environment specific should be added into respective environment properties file.
    