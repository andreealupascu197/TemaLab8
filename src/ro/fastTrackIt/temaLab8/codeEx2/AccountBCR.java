package ro.fastTrackIt.temaLab8.codeEx2;

public class AccountBCR implements BankAccount {
    private int balanceInAccount;

    AccountBCR(int balanceInAccount) {
        this.balanceInAccount = balanceInAccount;

    }

    @Override
    public int currentBalance() {
        return balanceInAccount;
    }

    @Override
    public int withdrawAmount(int amount) {
        balanceInAccount -= amount;
        return amount;
    }

    @Override
    public int depositAmount(int amount) {
        balanceInAccount += amount;
        return amount;
    }
}
