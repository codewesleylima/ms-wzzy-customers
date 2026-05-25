<p align="center">
  <img src="https://images.unsplash.com/photo-1552664730-d307ca884978?w=400" alt="Customers - WZZY">
</p>

## PERSONAL PROJECT - MS-CUSTOMERS 👥

### 📖 Description
Microservice responsible for **managing customers and their related data**. MS-Customers is responsible for:
- 👤 **Manage customer profiles** with personal information
- 📍 **Manage addresses** for delivery and billing
- ❤️ **Maintain favorites list** (customer's preferred books)
- ⚙️ **Manage preferences** for purchases and notifications
- 📋 **Maintain purchase history** for analysis and recommendations
- 🔍 **Search and filter customers** by various criteria
- 📊 **Analyze customer** behavior data

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Customer Management Flow

1. **Client** → BFF: Authentication/Registration
2. BFF → **ms-auth**: Validates credentials
3. **Client** → BFF: Requests to create/update profile
4. BFF → **ms-customers**: Sends customer data
5. **ms-customers** → Database: Persists customer profile
6. **ms-customers** → BFF: Confirms creation/update
7. **Client** → BFF: Requests to add address
8. BFF → **ms-customers**: Registers address
9. **Client** → BFF: Requests to add book to favorites
10. BFF → **ms-customers**: Registers favorite
11. **ms-customers** → Database: Persists customer data
12. **Client** → BFF: Makes purchase
13. BFF → **ms-customers**: Registers purchase in history
14. **ms-customers** → Database: Updates purchase history

---

### ⚡ Features

1. 👤 Manage customer profiles with personal data
2. 📍 Manage multiple addresses per customer
3. ❤️ Maintain list of favorite books
4. ⚙️ Manage purchase and notification preferences
5. 📋 Maintain complete purchase history
6. 🔍 Search customers by email, name, or document
7. 📊 Analyze purchase behavior data
8. 🔄 Update customer status (active/inactive)
9. 💳 Associate payment methods to customers

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and configured in `application.properties`.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQEVAsL2UL6A0w/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1721323972268?e=1746662400&v=beta&t=4_2RDPgz5FqJ2G-yRQk3y0vWMVRpSeAPKMAO7IOFXeE" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
