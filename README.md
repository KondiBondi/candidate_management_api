# candidate_management_api

REST API for managing candidates and recruitment processes.

## Tech stack:
- Java 21 + Spring Boot 3
- Spring Data JPA (PostgreSQL/MySQL)
- Spring Data MongoDB
- Spring Web, Validation, Lombok
- Optional: Spring Security, MS Graph API, Affinda Resume Parser

## Features:
- CRUD for candidates and job positions
- Assign candidates to recruitment processes
- Track process status changes
- Store notes and interview history in MongoDB
- (Optional) Parse CVs using external services

## Run locally:
```bash
./gradlew bootRun
# or
mvn spring-boot:run
```

## Future ideas:
- Add authentication (OAuth2 / JWT)
- Schedule tasks to fetch emails or parse CVs
- Dashboard with KPI stats via another service


Project structure:

project-root/
├── README.md
├── build.gradle
├── src/
│   └── main/
│       ├── java/com/kondibondi/candidate_management_api/
│       │   ├── CandidateManagementApiApplication.java
│       │   ├── config/        # Spring, Mongo, Security configuration
│       │   ├── controller/    # REST controllers
│       │   ├── service/       # Business logic
│       │   ├── repository/    # DB repos
│       │   ├── model/        
│       │   │   ├── no_sql/     # MongoDB entities
│       │   │   └── sql/        # SQL entities 
│       │   └── dto/           # DTO REST
│       └── resources/
│           ├── application.yml
│           └── data.sql (optional)
└──