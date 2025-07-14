# 💰 Banking Application

## 📌 Overview
This is a simple Java console-based banking system built using core **Object-Oriented Programming (OOP)** principles. The application allows users to manage bank accounts with features like account creation, deposits, withdrawals, updates, and account type-specific rules.

## 🚀 Features
- ✅ Create a new account (Savings or Current)
- 💵 Deposit money into an account
- 💸 Withdraw money with service charges based on account type
- 🧾 View account details
- 🔄 Change account type
- 🧹 Close/Delete an account
- 🔍 Search for accounts by account number

> 🛠️ **Note**:  
> Withdrawals apply service charges:  
> - **Savings Account**: 1.5% fee  
> - **Current Account**: 0.5% fee  

## 🔍 OOP Principles Used
- **Abstraction**:  
  An abstract class `Account` defines a general blueprint for all account types.

- **Encapsulation**:  
  Data like `name`, `balance`, and `account number` is managed through methods, protecting direct access.

- **Inheritance**:  
  `SavingsAccount` and `CurrentAccount` extend the `Account` class, inheriting common behavior.

- **Polymorphism**:  
  The `withdraw()` method is overridden in child classes to enforce account-specific service charges.

## 🧑‍💻 How to Run
1. Clone or download the repository:
   ```bash
   git clone https://github.com/WTechbyRalph/BankingApp

2. Navigate into the project directory:
     ```bash
     cd BankingApp/src

3. Compile the code:
   ```bash
    javac -d ../bin *.java

4. Run the application from the project root:
   ```bash
  java -cp bin Main

  BankingApp/
├── bin/                   # Compiled .class files
├── src/                   # Source code (.java files)
│   ├── Main.java
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   └── BankApp.java
└── README.md

📝 Author
Developed by Raphael Michael Akwetey.
Inspired by Java OOP coursework assignment.
🔗 https://github.com/WTechbyRalph
