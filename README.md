# saga-pattern

#to start each module 
mvn clean package spring-boot:run -pl order-service --also-make

mvn clean package spring-boot:run -pl payment-service --also-make

mvn package spring-boot:run -pl shipping-service --also-make

Basically, here we are just starting up the individual services. The –also-make parameter ensures that the dependencies for the project are also bundled up in the JAR file that gets created.

http://localhost:8080/swagger-ui.html

http://localhost:8080/h2-console