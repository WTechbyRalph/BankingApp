import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankApp bankApp = new BankApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAvailable Choices:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update account balance");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit money into an account");
            System.out.println("6. Withdraw money from an account");
            System.out.println("7. View account information");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankApp.createAccount();
                    break;
                case 2:
                    bankApp.displayAllAccounts();
                    break;
                case 3:
                    bankApp.updateAccountBalance();
                    break;
                case 4:
                    bankApp.deleteAccount();
                    break;
                case 5:
                    bankApp.depositAmount();
                    break;
                case 6:
                    bankApp.withdrawAmount();
                    break;
                case 7:
                    bankApp.viewAccountInfo();
                    break;
                case 8:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}
