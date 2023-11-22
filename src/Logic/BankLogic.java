package Logic;

import java.util.Scanner;

public class BankLogic {

    private int password, newpassword;
    private float availableBalance, withdrawalAmount, depositAmount;

    public BankLogic() {
    }

    public BankLogic(int password, int newpassword, float availableBalance, float withdrawalAmount, float depositAmount) {
        this.password = password;
        this.newpassword = newpassword;
        this.availableBalance = availableBalance;
        this.withdrawalAmount = withdrawalAmount;
        this.depositAmount = depositAmount;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getNewpassword() {
        return newpassword;
    }

    public float getAvailableBalance() {
        return availableBalance;
    }

    public float getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawalAmount(float withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void setAvailableBalance(float availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setNewpassword(int newpassword) {
        this.newpassword = newpassword;
    }

    public boolean validatePassword(int password) {
        return 123 == password;
    }

    public int validateNewPassword(int newpassword) {
        if (newpassword == this.password) {
            return 0;
        } else {
            this.password = newpassword;
            return 1;
        }
    }

    public int rotulo() {
        Scanner scanner = new Scanner(System.in);
        int option = 0; // opcao do usuario
        System.out.println("Main Menu");
        System.out.println("1 - View my balance");
        System.out.println("2 - Withdraw cash");
        System.out.println("3 - Deposit funds");
        System.out.println("4 - Exit");
        System.out.println("Enter a choice: ");
        option = scanner.nextInt();
        return option;
    }

    public void selection(int option) {
        switch (option) {
            case 1 -> {
                System.out.println("Balance Information:");
                System.out.println(" - Available balance: $" + this.availableBalance);
                System.out.println(" - Total balance: $" + this.availableBalance);
            }
            case 2 ->
                System.out.println("Please enter a withdrawal amount: ");
            case 3 ->
                System.out.println("Please enter a deposit amount: ");
            case 4 -> {
                System.out.println("Exiting the system...");
                System.exit(0);
            }
            default ->
                System.out.println("Invalid selection. Try again.");
        }
    }

}
