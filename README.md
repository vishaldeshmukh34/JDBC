# JDBC MVC CRUD Mini Project

## 📌 Project Description

This project is a **Java JDBC CRUD application** developed using the **MVC (Model–View–Controller) architecture**. It performs basic database operations such as **Insert, View, Update, and Delete** on a `students` table using **MySQL** and **PreparedStatement**.

This project is suitable for **BCA students**, academic submissions, and basic interview preparation.

---

## 🛠️ Technologies Used

* Java (JDK 8+)
* JDBC (MySQL Connector/J)
* MySQL Database
* Eclipse IDE
* MVC Architecture

---

## 🗂️ Project Structure

```
src/
 └── com.controller
 │    └── Studentcontroller.java
 └── com.servise
 │    └── Studentservise.java
 └── com.dao
 │    └── Studentdao.java
 └── com.entities
 │    └── Studententities.java
 └── com.util
      └── DBConnection.java
```

---

## 🧱 Database Details

### Database Name

```
mydb
```

### Table Structure

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100)
);
```

---

## ⚙️ How to Run the Project

1. Clone this repository
2. Open the project in **Eclipse IDE**
3. Add **MySQL Connector/J** to the project build path
4. Make sure MySQL server is running
5. Update database credentials in `DBConnection.java`
6. Run the application from:

   👉 `Studentcontroller.java`

---

## ▶️ Sample Output

```
Enter your ID:
1
Enter your Name:
Vishal
Enter your City:
Pune
Data Inserted Successfully
```

---

## 📚 Features

* Insert student data using PreparedStatement
* MVC layered architecture
* Secure database interaction
* Easy to understand for beginners

---

## 🎓 Learning Outcome

* Understanding of JDBC
* MVC architecture implementation
* PreparedStatement usage
* MySQL database integration

---

## 👤 Author

**Vishal Deshmukh**
BCA Student
Batch No: 416

---

## 📎 GitHub Repository

*(https://github.com/vishaldeshmukh34/JDBC)*

---

## ✅ Status

✔ Task Completed Successfully
