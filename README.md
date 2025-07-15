# Employee Management System – Backend

This is the **backend** of the Employee Management System developed using **Spring Boot** and **MySQL**. It provides RESTful APIs to perform CRUD operations on employee data.

## 🔗 Frontend Repository
➡️ https://github.com/rockyhans/Employee-Management-App
---

## 📌 Tech Stack

- **Java 17+**
- **Spring Boot**
- **MySQL**
- **Spring Data JPA**
- **Spring Web**
- **Lombok**
- **CORS support for frontend integration**

---

## 📂 Project Structure
```
src/
├── main/
│ ├── java/
│ │ └── com/employee/management/
│ │ ├── controllers/
│ │ ├── entities/
│ │ ├── repositories/
│ │ └── EmployeeManagementSystemApplication.java
│ └── resources/
│ ├── application.properties
│ └── data.sql
└── test/
```

---

## 🚀 How to Run Locally

### 1. Clone the Repository

```bash
git clone https://github.com/rockyhans/EmployeeManagementSystemApplication-Backend
cd backend-repo-name
```
### 2. Configure MySQL
Create a database named empdb in MySQL:
```
CREATE DATABASE empdb;
```
Update your application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/empdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```
3. Run the Application
You can run the app via your IDE or command line:
```
./mvnw spring-boot:run
```
Application will be available at:
http://localhost:8080

### 🔄 API Endpoints

| Method | Endpoint              | Description         |
| ------ | --------------------- | ------------------- |
| GET    | `/api/employees`      | Get all employees   |
| POST   | `/api/employees`      | Create new employee |
| GET    | `/api/employees/{id}` | Get employee by ID  |
| PUT    | `/api/employees/{id}` | Update employee     |
| DELETE | `/api/employees/{id}` | Delete employee     |

👤 Contributors
<table> <tr> <td align="center"> <img src="https://avatars.githubusercontent.com/u/164065390?v=4" width="80px;" alt="Danish Rizwan"/> <br /><sub><b>Danish Rizwan</b></sub><br /> <sub>Frontend Developer</sub> </td> </tr> </table>

📬 Contact
<br>
📧 Email: rdanishrizwan@example.com
<br>
💼 Team: Rizwan's
