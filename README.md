# 📝 Task Management API

A Spring Boot-based RESTful API for managing tasks, with integrated MySQL database support, built using a clean 3-layer architecture (Controller, Service, Repository) and Spring Security for basic authentication.

---

## 🚀 Features

* Create, view, update, and delete tasks (CRUD operations)
* Layered architecture: Controller → Service → Repository
* Field-level validation and meaningful error messages
* Secured endpoints using Spring Security
* JSON-based API communication
* MySQL database integration
* REST API tested with Postman

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Database:** MySQL
* **Security:** Spring Security
* **Build Tool:** Maven
* **API Testing:** Postman

---

## 📁 Project Structure

```
src
 └── main
     └── java
         └── com.example.taskmanager
             ├── controller         # TaskController.java
             ├── model              # Task.java
             ├── service            # TaskService.java
             ├── repository         # TaskRepository.java
             ├── config             # SecurityConfig.java
             └── TaskApp.java       # Main Application
```

---

## 📦 How to Run

### Prerequisites

* Java 17+
* Maven
* MySQL

### Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-username/task-manager.git
   cd task-manager
   ```

2. **Configure MySQL**

   * Create a database named `taskdb`
   * Update your `application.properties`:

     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
     spring.datasource.username=root
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**

   * Base URL: `http://localhost:8080/api/tasks`

---

## 🔐 Authentication

* Spring Security is configured to secure the application.
* Default configuration can be customized in `SecurityConfig.java`.

---

## 📮 API Endpoints

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| POST   | `/api/tasks`      | Create a new task |
| GET    | `/api/tasks`      | Get all tasks     |
| GET    | `/api/tasks/{id}` | Get task by ID    |
| PUT    | `/api/tasks/{id}` | Update a task     |
| DELETE | `/api/tasks/{id}` | Delete a task     |

---

## 📌 Sample JSON

```json
{
  "title": "Finish Project",
  "description": "Complete the backend by Friday",
  "dueDate": "2025-06-10"
}
```

---

## 🧪 Testing

* Use Postman to test all API endpoints.
* Verify authentication headers if security is enabled.

---

## 👩‍💻 Author

**Kalpana Shankar**
Aspiring Full Stack Developer


