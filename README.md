# Sales API Complete for VS Code

## Run
Use Maven to run the application.

To run with H2 (dev profile):

```
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

To run normally (Postgres configured in application.yml):

```
mvn spring-boot:run
```

## Endpoints
- REST hello: GET http://localhost:8080/clientes/hello
- SOAP WSDL: http://localhost:8080/ws/frete.wsdl
