public abstract class Account {
    private String name;
    private int number;
    private String creationDate;
    protected int balance;

    public Account(String name, int number, String creationDate, int balance) {
        this.name = name;
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println("Account - Name: " + name + ", Account Number: " + number +
                ", Creation Date: " + creationDate + ", Balance: " + balance);
    }

    public void updateBalance(int amount) {
        balance += amount;
    }

    public abstract boolean withdraw(int amount);
}
