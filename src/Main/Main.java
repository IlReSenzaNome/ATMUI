package Main;

import java.util.Scanner;
import Interfaces.BankUI;
import Logic.BankLogic;

public class Main {

    public static void main(String[] args) {
        BankUI bankui = new BankUI();
        bankui.setVisible(true);
       
        /*BankLogic bankLogic = new BankLogic();
        bankui.setLocationRelativeTo(null);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");

        try {
            bankLogic.setPassword(scanner.nextInt());
            boolean isPasswordValid = bankLogic.validatePassword();

            if (isPasswordValid) {
                int option = bankLogic.rotulo();
                bankLogic.selection(option);
            } else {
                System.out.println("Your password is invalid!");
            }
        } catch (Exception e) {
            System.out.println("Input a numeric password");
            System.exit(0);
        }*/

    }

}
