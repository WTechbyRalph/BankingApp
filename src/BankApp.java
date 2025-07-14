import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    private static final int minBalanceToOpen = 1000;
    public static final int minBalanceRemainAfterWithdraw = 1000;
    private List<Account> accounts;

    public BankApp() {
        accounts = new ArrayList<>();
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select account type:\n1. Savings Account\n2. Current Account");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        int number;
        System.out.print("Enter account number: ");
        number = scanner.nextInt();

        System.out.print("Enter account balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (balance < minBalanceToOpen) {
            System.out.println("Balance must be at least " + minBalanceToOpen);
            return;
        }

        System.out.print("Enter account creation date: ");
        String creationDate = scanner.nextLine();

        switch (choice) {
            case 1:
                accounts.add(new SavingsAccount(name, number, creationDate, balance));
                break;
            case 2:
                accounts.add(new CurrentAccount(name, number, creationDate, balance));
                break;
            default:
                System.out.println("Invalid account type!");
        }
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                account.display();
            }
        }
    }

    public void updateAccountBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to update balance: ");
            int amount = scanner.nextInt();
            account.updateBalance(amount);
            System.out.println("Balance updated successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void deleteAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number to delete: ");
        int accountNumber = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void depositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            int amount = scanner.nextInt();
            account.updateBalance(amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            int amount = scanner.nextInt();
            if (account.withdraw(amount)) {
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds or minimum balance requirement not met.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewAccountInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.display();
        } else {
            System.out.println("Account not found.");
        }
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
