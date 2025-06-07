# SpringPrcaticeProject
This the repository  where i will post all my spring related projects.


# Player Management System (Spring Boot CRUD App)

A simple Player Management System built using Spring Boot, performing full CRUD operations (Create, Read, Update, Delete) on player data.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for API testing)

---

## Features

- Add a new player
- View all players
- Get player by name
- Update player details
- Delete player by name

---

## API Endpoints

Base URL: `http://localhost:8080/api/players`

| Method | Endpoint              | Description             |
|--------|-----------------------|-------------------------|
| GET    | `/api/players`        | Get all players         |
| GET    | `/api/players/{name}` | Get a player by name    |
| POST   | `/api/players`        | Add a new player        |
| PUT    | `/api/players/{name}` | Update an existing player |
| DELETE | `/api/players/{name}` | Delete a player by name |

---

## Sample JSON for POST/PUT

```json
{
  "name": "Erling Haaland",
  "nation": "Norway",
  "pos": "FW",
  "age": 23,
  "mp": 35,
  "starts": 27,
  "gls": 5,
  "team": "Manchester City"
}



