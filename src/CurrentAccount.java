public class CurrentAccount extends Account {
    public CurrentAccount(String name, int number, String creationDate, int balance) {
        super(name, number, creationDate, balance);
    }

    @Override
    public boolean withdraw(int amount) {
        double serviceCharge = 0.005; // 0.5% service charge for Current
        int totalDeduction = (int) (amount + (amount * serviceCharge));
        if (balance - totalDeduction >= BankApp.minBalanceRemainAfterWithdraw) {
            updateBalance(-totalDeduction);
            return true;
        }
        return false;
    }
}
