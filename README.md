# 🎮 Game Store API 

A RESTful API built with **Java** and **Spring Boot** to manage products and categories for a digital game store. This project features a robust **One-to-Many** relational database schema powered by **MySQL** and **Spring Data JPA**.

---

## 🚀 Technologies & Tools

Here are the badges representing the core stack used in this project:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Insomnia](https://img.shields.io/badge/Insomnia-black?style=for-the-badge&logo=Insomnia&logoColor=5849BE)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

---

## 📐 Database Architecture

The system uses a bidirectional relational mapping where **One Category contains Many Products** (`@OneToMany` and `@ManyToOne`).
