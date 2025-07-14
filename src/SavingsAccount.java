public class SavingsAccount extends Account {
    public SavingsAccount(String name, int number, String creationDate, int balance) {
        super(name, number, creationDate, balance);
    }

    @Override
    public boolean withdraw(int amount) {
        double serviceCharge = 0.015; // 1.5% service charge for Savings
        int totalDeduction = (int) (amount + (amount * serviceCharge));
        if (balance - totalDeduction >= BankApp.minBalanceRemainAfterWithdraw) {
            updateBalance(-totalDeduction);
            return true;
        }
        return false;
    }
}
