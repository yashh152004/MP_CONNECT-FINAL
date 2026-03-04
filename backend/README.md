# MP-CONNECT Backend

This is the fully functioning Spring Boot backend for the MP-CONNECT system. It was generated exactly matching the frontend models defined in `types.ts`, adhering to a strict Entity-first design with layered Spring Boot architecture.

## Tech Stack
- Java 17+
- Spring Boot 3.2.x
- Spring Data JPA (Hibernate)
- Spring Security (JWT Stateless Authentication)
- MySQL
- Maven

## How to Run the Backend

1. **Install Prerequisites**: 
    - Ensure you have **Java 17** or above installed.
    - Ensure you have **Maven** installed and available in your PATH.
    - Ensure you have a local **MySQL** database running on port `3306`.
2. **Database Setup**:
    - By default, `application.properties` is configured to connect to `jdbc:mysql://localhost:3306/mp_connect_db` with `root`/`root`.
    - It uses `createDatabaseIfNotExist=true`, so the database should be automatically created.
3. **Run Application**:
    - Open your terminal in the `backend` folder and run: `mvn spring-boot:run`
    - Or if this project uses an IDE (like IntelliJ/Eclipse), just run `MpConnectApplication.java`.
4. **Access the API**: 
    - The backend will startup and run on `http://localhost:8080`.

## API Documentation & Sample Requests/Responses

### 1. Authentication (JWT)
**Register Official / Citizen:**
```http
POST /api/auth/register
Content-Type: application/json

{
  "name": "Rahul Sharma",
  "email": "rahul@gov.in",
  "password": "SecurePassword123!",
  "role": "MP",
  "constituency": "Northeast Delhi"
}
```
**Response (200 OK):**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIi...",
  "userId": "uuid-here",
  "name": "Rahul Sharma",
  "role": "MP"
}
```

**Login:**
```http
POST /api/auth/login
Content-Type: application/json

{
  "email": "rahul@gov.in",
  "password": "SecurePassword123!"
}
```

### 2. General Endpoints (Require Bearer Token)
Every request below requires the previously received token in the `Authorization` header:
`Authorization: Bearer <your-jwt-token-here>`

#### **Letters**
```http
POST /api/letters
{
  "type": "Central",
  "department": "Transport",
  "title": "Road Expansion Issue",
  "content": "A detailed content...",
  "status": "Pending",
  "tags": ["roads", "infrastructure"]
}
```
**Response (200 OK):**
```json
{
  "id": "abc-123",
  "type": "Central",
  "department": "Transport",
  "title": "Road Expansion Issue",
  "content": "...",
  "status": "Pending",
  "version": 1,
  "createdAt": "2026-03-04T12:00:00.000000",
  "updatedAt": "2026-03-04T12:00:00.000000"
}
```

#### **Complaints**
```http
POST /api/complaints
{
  "category": "Water",
  "location": "Sector 4",
  "description": "No water supply for 3 days.",
  "citizenName": "John Doe",
  "priority": "High"
}
```
**Response (200 OK):**
```json
{
  "id": "complaint-uuid",
  "category": "Water",
  "location": "Sector 4",
  "status": "New",
  "createdAt": "2026-03-04T12:00:00.000",
  "citizenName": "John Doe",
  "priority": "High"
}
```

#### **Contacts**
```http
GET /api/contacts
```
**Response (200 OK):**
```json
[
  {
    "id": "contact-uuid",
    "name": "IAS Vivek",
    "designation": "District Magistrate",
    "state": "UP",
    "zilla": "Lucknow",
    "mobile": "9999999999",
    "category": "Officer",
    "isVip": true
  }
]
```

#### **Plan Today Events**
```http
POST /api/plan-today-events
{
  "title": "Morning Inspection",
  "type": "Inspection",
  "date": "2026-03-04",
  "startTime": "10:00",
  "locName": "Town Hall",
  "purpose": "Check water supply issues"
}
```

### Supported Entities (fully mapped out with CRUD APIs)
All entities provide `GET`, `GET /{id}`, `POST`, `PUT /{id}`, and `DELETE /{id}` endpoints representing complete CRUD mapping from `types.ts`.
- `/api/auth/register`, `/api/auth/login`
- `/api/letters`
- `/api/complaints`
- `/api/contacts`
- `/api/greetings`
- `/api/projects`
- `/api/tour-packages`
- `/api/destinations`
- `/api/scheduled-tours`
- `/api/plan-today-events`
- `/api/tour-programs`
- `/api/works` (Development Works)
