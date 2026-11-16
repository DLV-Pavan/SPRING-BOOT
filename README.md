# SPRING BOOT – THEORY NOTES

## 1. Introduction to Spring Boot

Spring Boot is a Java-based framework used to develop standalone, production-ready applications quickly and easily.

It is built on top of the Spring Framework and reduces configuration through auto-configuration.

### Advantages
- Reduces boilerplate code.
- Provides auto-configuration.
- Supports embedded servers.
- Simplifies dependency management.
- Makes application development faster.

## 2. Features of Spring Boot

1. **Auto Configuration:** Automatically configures the application based on the dependencies available.
2. **Starter Dependencies:** Provides ready-made dependencies for specific functionalities.
3. **Embedded Server:** Supports servers like Tomcat and Jetty.
4. **Spring Boot Actuator:** Provides application monitoring and management.
5. **Standalone Application:** Applications can run independently without deploying to an external server.

## 3. Spring Boot Architecture

The main layers of a Spring Boot application are:

- **Controller Layer:** Handles incoming HTTP requests.
- **Service Layer:** Contains business logic.
- **Repository Layer:** Communicates with the database.
- **Model/Entity Layer:** Represents application data.

## 4. Important Spring Boot Annotations

- `@SpringBootApplication` – Main annotation used to start a Spring Boot application.
- `@RestController` – Creates RESTful web controllers.
- `@Controller` – Handles web requests and returns views.
- `@RequestMapping` – Maps HTTP requests to methods.
- `@GetMapping` – Handles GET requests.
- `@PostMapping` – Handles POST requests.
- `@PutMapping` – Handles PUT requests.
- `@DeleteMapping` – Handles DELETE requests.
- `@Autowired` – Injects dependencies automatically.
- `@Service` – Marks a service class.
- `@Repository` – Marks a repository class.
- `@Component` – Marks a class as a Spring-managed component.
- `@Entity` – Marks a class as a JPA entity.
- `@Id` – Defines the primary key.

## 5. Dependency Injection

Dependency Injection (DI) is a design pattern in which Spring provides the required objects to a class instead of creating them manually.

Types:
1. Constructor Injection
2. Setter Injection
3. Field Injection

Constructor injection is generally recommended.

## 6. Spring Boot MVC

Spring MVC is used to develop web applications using the Model-View-Controller architecture.

- Model: Handles application data.
- View: Displays data to the user.
- Controller: Handles user requests and coordinates the application.

## 7. Spring Data JPA

Spring Data JPA simplifies database operations by reducing the need to write repetitive database access code.

Important interfaces:
- `JpaRepository`
- `CrudRepository`
- `PagingAndSortingRepository`

Common operations:
- Save records.
- Retrieve records.
- Update records.
- Delete records.

## 8. Hibernate

Hibernate is an ORM (Object Relational Mapping) framework.

It maps Java objects to database tables and simplifies database interactions.

## 9. REST API

REST stands for Representational State Transfer.

It is an architectural style used to communicate between applications over HTTP.

Common HTTP methods:
- GET – Retrieve data.
- POST – Create data.
- PUT – Update data.
- DELETE – Delete data.

## 10. Spring Boot Application Execution

1. Create a Spring Boot project.
2. Add the required dependencies.
3. Create the main application class.
4. Develop Controller, Service and Repository layers.
5. Configure database properties if required.
6. Run the application using the main method.
7. Test the application using a browser or Postman.

## 11. Tools and Technologies

- Programming Language: Java
- Framework: Spring Boot
- Database: MySQL
- ORM: Hibernate
- Persistence: Spring Data JPA
- IDE: Spring Tool Suite / Eclipse
- API Testing: Postman
- Build Tool: Maven
- Version Control: Git and GitHub

---

## Author

**DLV Pavan**

GitHub: https://github.com/DLV-Pavan

Repository: SPRING-BOOT