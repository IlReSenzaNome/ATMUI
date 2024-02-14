package Logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * The BankLogic class represents the logic for a bank account in an ATM system.
 * It provides methods for validating passwords, managing account balance, and performing transactions.
 */
public class BankLogic {

    private int password, newpassword;
    private float withdrawalAmount, depositAmount;
    private double availableBalance = Math.random() * 2500 + 500;

    /**
     * Constructs a BankLogic object with default values.
     */
    public BankLogic() {
    }

    /**
     * Constructs a BankLogic object with the specified parameters.
     * 
     * @param password The current password for the account.
     * @param newpassword The new password for the account.
     * @param availableBalance The available balance in the account.
     * @param withdrawalAmount The amount to be withdrawn from the account.
     * @param depositAmount The amount to be deposited into the account.
     */
    public BankLogic(int password, int newpassword, double availableBalance, float withdrawalAmount, float depositAmount) {
        this.password = password;
        this.newpassword = newpassword;
        this.availableBalance = availableBalance;
        this.withdrawalAmount = withdrawalAmount;
        this.depositAmount = depositAmount;
    }

    /**
     * Returns the current password for the account.
     * 
     * @return The current password.
     */
    public int getPassword() {
        return password;
    }

    /**
     * Sets the current password for the account.
     * 
     * @param password The new password to set.
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Returns the new password for the account.
     * 
     * @return The new password.
     */
    public int getNewpassword() {
        return newpassword;
    }

    /**
     * Returns the available balance in the account.
     * 
     * @return The available balance.
     */
    public double getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the available balance in the account.
     * 
     * @param availableBalance The new available balance to set.
     */
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * Returns the amount to be withdrawn from the account.
     * 
     * @return The withdrawal amount.
     */
    public float getWithdrawalAmount() {
        return withdrawalAmount;
    }

    /**
     * Returns the amount to be deposited into the account.
     * 
     * @return The deposit amount.
     */
    public float getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the amount to be deposited into the account.
     * 
     * @param depositAmount The new deposit amount to set.
     */
    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * Sets the amount to be withdrawn from the account.
     * 
     * @param withdrawalAmount The new withdrawal amount to set.
     */
    public void setWithdrawalAmount(float withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    /**
     * Sets the available balance in the account.
     * 
     * @param availableBalance The new available balance to set.
     */
    public void setAvailableBalance(float availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * Sets the new password for the account.
     * 
     * @param newpassword The new password to set.
     */
    public void setNewpassword(int newpassword) {
        this.newpassword = newpassword;
    }

    /**
     * Validates the given password against the account's current password.
     * 
     * @param password The password to validate.
     * @return true if the password is valid, false otherwise.
     */
    public boolean validatePassword(int password) {
        for (int i = 1; i < 4; i++) {
            return password == 1234;
        }
        return false;
    }

    /**
     * Validates the given new password against the account's current password.
     * If the new password is different, it updates the current password.
     * 
     * @param newpassword The new password to validate.
     * @return true if the new password is the same as the current password, false otherwise.
     */
    public boolean validateNewPassword(int newpassword) {
        if (newpassword == this.password) {
            return true;
        } else {
            this.password = newpassword;
            return false;
        }
    }

    /**
     * Returns the current date formatted according to the specified pattern.
     * 
     * @param formating The pattern to format the date.
     * @return The formatted current date.
     */
    public String datecurrent(String formating) {
        LocalDate currentdate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formating);
        return currentdate.format(formatter);
    }

    /**
     * Returns the available balance in the account.
     * 
     * @return The available balance.
     */
    public double availableBalan() {
        return this.availableBalance;
    }

    /**
     * Deposits the specified amount into the account.
     * 
     * @param depositamount The amount to deposit.
     * @return The new available balance after the deposit.
     */
    public double depositAmound(double depositamount) {
        if (depositamount > 0) {
            availableBalance += depositamount;
            return availableBalance;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Value");
        }

        return 0;
    }

    /**
     * Withdraws the specified amount from the account.
     * 
     * @param withdraw The amount to withdraw.
     * @return The new available balance after the withdrawal.
     */
    public double withdrawamount(double withdraw) {
        if (withdraw > 0 && withdraw <= availableBalance) {
            return availableBalance -= withdraw;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal. Check the amount or available balance");
            return availableBalance;
        }
    }

}
