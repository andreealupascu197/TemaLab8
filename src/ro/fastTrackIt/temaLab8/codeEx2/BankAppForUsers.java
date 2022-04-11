package ro.fastTrackIt.temaLab8.codeEx2;

public class BankAppForUsers {
    private BankAccount bankAccount;

    public BankAppForUsers(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String optionToWithdraw(int amount) {
        return "You withdrew " + bankAccount.withdrawAmount(amount) + "." + "Your current balance is " + bankAccount.currentBalance() + ". ";
    }

    public String optionToDeposit(int amount) {
        return "You deposited " + bankAccount.depositAmount(amount) + "." + "Your current balance is " + bankAccount.currentBalance() + ". ";
    }
}
