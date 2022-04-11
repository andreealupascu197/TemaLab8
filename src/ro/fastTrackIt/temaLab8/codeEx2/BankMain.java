package ro.fastTrackIt.temaLab8.codeEx2;

public class BankMain {
    public static void main(String[] args) {
        AccountING stefan = new AccountING(3000);
        BankAppForUsers bankApp = new BankAppForUsers(stefan);
        System.out.println(bankApp.optionToDeposit(2000));
        System.out.println(bankApp.optionToWithdraw(100));
    }


}
