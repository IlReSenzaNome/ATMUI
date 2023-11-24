package Logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankLogic {

    private int password, newpassword;
    private float withdrawalAmount, depositAmount;
    private double availableBalance = Math.random() * 2500 + 500;

    public BankLogic() {
    }

    public BankLogic(int password, int newpassword, double availableBalance, float withdrawalAmount, float depositAmount) {
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

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
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
        for (int i = 1; i < 4; i++) {
            return password == 1234;
        }
        return false;
    }

    public int validateNewPassword(int newpassword) {
        if (newpassword == this.password) {
            return 0;
        } else {
            this.password = newpassword;
            return 1;
        }
    }

    public String datecurrent(String formating) {
        LocalDate currentdate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formating);
        return currentdate.format(formatter);
    }
    
    public double availableBalan(){
        return this.availableBalance;
    }
    
    public double depositAmound(double depositamound){
        double Deposit = availableBalance + depositamound;
        
        return 0;
    }

}
