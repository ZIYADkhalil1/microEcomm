# 🛒 E-Commerce Backend (Spring Boot)

A backend-only e-commerce platform providing REST APIs for product management and order processing.  
Built with **Spring Boot**, **MySQL**, and **MongoDB Atlas** following a clean layered architecture.

---

## 🚀 Features (APIs)
### 🛒 Products
- `GET /api/products` → List all products  
- `GET /api/products/{id}` → Get product by ID  
- `POST /api/products` → Add new product 
- `PUT /api/products/{id}` → Update product
- `DELETE /api/products/{id}` → Delete product 

### 📦 Orders
- `POST /api/orders` → Create new order  
- `GET /api/orders/{id}` → Get order details  
- `GET /api/orders/user/{id}` → List all orders by user  

---

## 🛠️ Tech Stack
- **Backend**: Java 17, Spring Boot, Spring Data JPA
- **Databases**: MySQL (Users, Orders), MongoDB Atlas (Products)  
- **Tools**: Maven, Lombok, Postman (testing)

---
