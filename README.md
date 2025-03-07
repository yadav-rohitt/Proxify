# Selenium TestNG Automation for Proxify Plans Page

## 📌 Project Overview
This project automates the **Proxify Plans page (`https://proxify.gg/plans`)** using **Selenium WebDriver** with **TestNG**.  
The script **clicks on a product** and **verifies if the product details are visible**.

---

## ⚙️ Tech Stack
- **Java** (JDK 11 or later)
- **Selenium WebDriver**
- **TestNG**
- **Maven** (for dependency management)
- **WebDriverManager** (for managing browser drivers)

---

## 🛠️ Setup Instructions

### 1️⃣ **Clone the Repository**
```sh
git clone https://github.com/your-repo/proxify-selenium.git
cd proxify-selenium

proxify/
│── src/
│   ├── main/
│   │   ├── java/
│   ├── test/
│   │   ├── java/
│   │   │   ├── pom/                 # Page Object Model Classes
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── SignupPage.java
│   │   │   │   ├── PlansPage.java
│   │   │   ├── tests/               # Test Cases
│   │   │   │   ├── LoginTest.java
│   │   │   │   ├── SignupTest.java
│   │   │   │   ├── PlansTest.java
│   ├── test/resources/
│── pom.xml                           # Maven Configuration
│── test-output/                       # Test Reports
│── target/

