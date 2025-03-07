
##  Project Overview
Proxify is a platform that provides access to a network of professional developers for hire. The website (https://proxify.gg/dashboard) offers various plans tailored to different needs, such as part-time, full-time, or project-based  work.

This project focuses on **manual testing** of key modules within the Proxify platform. The testing process involves verifying core functionalities, UI/UX aspects and system responses.

---

##  **Scope of Testing**
The **manual testing** process covers the following key modules:

###  **1. Dashboard**
 Verifying navigation, UI elements, and data consistency.  
 Ensuring dashboard statistics update correctly.  

###  **2. Plans**
 Checking if different plans are displayed with accurate details.  
 Validating selection and redirection functionalities.  

###  **3. Invoices**
 Checking invoice generation, download functionality, and data correctness.  
 Ensuring proper tax calculations and transaction records.  

###  **4. Top-up**
 Testing the payment processing system and transaction logs.  
 Verifying error handling during payment failures.  

###  **5. Referrals**
 Testing referral links, earnings calculations, and copy link functionality.  
 Validating referral bonus application.  

---

##  **Testing Approach**
This project follows a **structured manual testing** approach, including:

###  **1. Functional Testing**
- Ensuring each feature works as expected.
- Validating system behaviors under different conditions.

###  **2. UI/UX Testing**
- Checking design consistency and responsiveness.
- Ensuring proper alignment and usability.

###  **3. Boundary Value Analysis**
- Testing input fields with minimum and maximum values.
- Ensuring correct error messages are displayed.

###  **4. Error Handling Testing**
- Checking how the system responds to invalid inputs.
- Verifying failure scenarios like incorrect login credentials or failed payments.

---


##  **Test Documents**
The following **test Documents** document the manual testing process:

###  **1. Test Plan**
- **Objectives:** Define the testing purpose and goals.
- **Scope:** Specify tested modules and exclusions.
- **Testing Approach:** Describe testing methods used.
- **Test Environment:** Outline system requirements.
- **Test Deliverables:** List testing reports.
- **Risks & Mitigation:** Identify potential risks and solutions.

###  **2. Test Scenario**
- **Test Scenario ID**
- **Module**
- **Test Scenario Description**
  
###  **2. Test Cases**
Each module has structured test cases, including:
- **Test Case ID**
- **Test Case Description**
- **Pre-Conditions** 
- **Test Steps**
- **Test Data**
- **Expected & Actual Results**
- **Status (Pass/Fail)**

###  **3. Bug Report**
- **Bug ID**
- **Description**
- **Steps to Reproduce**
- **Severity & Priority**
- **Screenshots**


###  **5. Test Summary Report**
- **Summary of Test Execution**
- **Pass/Fail**




##  **Agile Methodology in Testing**
This testing process follows an **Agile Methodology** to ensure continuous and iterative testing:

 **Sprint-based Testing** – Dividing testing activities into multiple sprints.  
 **Daily Stand-up Meetings** – Discussing test progress, blockers, and solutions.  
 **Collaboration with Developers** – Continuous integration with the development team.  
 **Frequent Builds & Releases** – Ensuring testing is performed on updated builds.  
 **Exploratory Testing** – Conducting ad-hoc testing to uncover hidden defects.  

---

### 1️ **Clone the Repository**
```sh
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

