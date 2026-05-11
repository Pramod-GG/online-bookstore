# 📚 Online Bookstore – Full Stack Web Application

## 🚀 Project Overview

Online Bookstore is a full stack web application developed using Java Spring Boot for the backend and HTML, CSS, and JavaScript for the frontend.

Users can:

* Browse available books
* Search books by title
* Add books to cart
* Remove books from cart
* Checkout orders

This project demonstrates frontend-backend integration using REST APIs.

---

# 🛠️ Tech Stack

## Frontend

* HTML
* CSS
* JavaScript

## Backend

* Java
* Spring Boot
* Spring Web MVC

## Tools

* VS Code
* GitHub
* Maven

---

# ✨ Features

✅ Display books dynamically from backend APIs
✅ Search functionality
✅ Add to cart
✅ Remove from cart
✅ Checkout functionality
✅ Responsive modern UI
✅ REST API integration
✅ Full stack architecture

---

# 📂 Project Structure

```bash
online-bookstore/
│
├── frontend/
│   ├── index.html
│   ├── cart.html
│   ├── style.css
│   └── script.js
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── bookstore/
│                   ├── controller/
│                   ├── model/
│                   ├── service/
│                   └── BookstoreApplication.java
│
├── pom.xml
└── README.md
```

---

# 🔌 REST API Endpoints

| Method | Endpoint    | Description           |
| ------ | ----------- | --------------------- |
| GET    | /books      | Fetch all books       |
| GET    | /books/{id} | Fetch book by ID      |
| POST   | /cart/{id}  | Add book to cart      |
| GET    | /cart       | View cart             |
| DELETE | /cart/{id}  | Remove item from cart |
| POST   | /checkout   | Place order           |

---

# ▶️ How to Run the Project

## 1️⃣ Clone Repository

```bash
git clone https://github.com/Pramod-GG/online-bookstore.git
```

---

## 2️⃣ Run Backend

Open terminal in project root:

```bash
./mvnw spring-boot:run
```

Backend runs on:

```bash
http://localhost:8080
```

---

## 3️⃣ Run Frontend

Open another terminal:

```bash
cd frontend
python -m http.server 5500
```

Frontend runs on:

```bash
http://localhost:5500
```

---

# 📸 Screenshots

## Homepage

<img width="1600" height="845" alt="homepage" src="https://github.com/user-attachments/assets/66673dd6-26f4-45f6-a432-deaa52418044" />




## Cart Page

<img width="1600" height="842" alt="image" src="https://github.com/user-attachments/assets/bdb5ee25-2f82-4713-b41f-afa9f5c7ba5e" />


---

# 🎯 Learning Outcomes

* Understanding REST APIs
* Frontend and backend integration
* Spring Boot MVC architecture
* Dynamic UI rendering using JavaScript
* GitHub project management
* Full stack application development

---

# 👨‍💻 Author

Pramod GG

GitHub: [https://github.com/Pramod-GG](https://github.com/Pramod-GG)
