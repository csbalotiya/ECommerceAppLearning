# Authentication process to access application APIs/endpoints flow 
Spring Boot JWT Authentication Spring Security & Spring Data JPA

## User Registration, User Login and Authorization process.
The diagram shows flow of how we implement User Registration, User Login and Authorization processes.

![image](https://github.com/csbalotiya/ECommerceAppLearning/assets/74857569/f74f8846-c6ab-4b05-b2c5-13dbf32dd761)


## Refresh Token

![image](https://github.com/csbalotiya/ECommerceAppLearning/assets/74857569/d2162597-c8e8-4fb0-8692-2556b4779117)


## Spring Boot Server Architecture with Spring Security

You can have an overview of our Spring Boot Server with the diagram below:

![image](https://github.com/csbalotiya/ECommerceAppLearning/assets/74857569/1bd5ec34-4190-4aaf-992e-a03830cd026b)

## Configure Spring Datasource, JPA, App properties

### Database

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce

spring.datasource.username=root

spring.datasource.password=12345


### Hibernate

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

spring.jpa.hibernate.ddl-auto=update


### Security

ecommerce.app.jwtSecret= ======================ECommerce=Spring===========================

ecommerce.app.jwtExpirationMs=86400000


### Swagger
URl = http://localhost:8080/swagger-ui/index.html

![image](https://github.com/csbalotiya/ECommerceServerApp/assets/74857569/81a8e0b6-6912-4876-93e7-cf754a54dd89)


# Run following SQL insert statements

INSERT INTO roles(name) VALUES('ROLE_USER');

INSERT INTO roles(name) VALUES('ROLE_MODERATOR');

INSERT INTO roles(name) VALUES('ROLE_ADMIN');



