# Banking Application

## Overview
This is a simple Java-based banking application utilizing Object-Oriented Programming (OOP) principles. The application allows users to create accounts, view account information, deposit/withdraw funds, and perform account management tasks.

### Key Features:
- Create a new account (Savings or Current).
- Deposit and withdraw money with service charges.
- Display all accounts.
- Update account balances.
- Delete accounts.
- Search for account information.

### How to Run:
1. Clone the repository.
2. Navigate to the `src/` directory.
3. Compile the Java files using `javac *.java`.
4. Run the application with `java Main`.

### OOP Principles Used:
- **Abstraction**: Used an abstract class `Account` to define common behaviors for different account types.
- **Encapsulation**: Account details (like name, number, balance) are hidden from direct access and managed through methods.
- **Inheritance**: `SavingsAccount` and `CurrentAccount` inherit from `Account` and override behavior (e.g., withdrawal rules).
- **Polymorphism**: The `withdraw` method is overridden in subclasses to apply specific rules for savings and current accounts.
