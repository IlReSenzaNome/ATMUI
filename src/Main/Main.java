/**
 * The Main class is the entry point of the application.
 * It creates an instance of the BankUI class and makes it visible.
 */
package Main;

import Interfaces.BankUI;

public class Main {

    public static void main(String[] args) {
        BankUI bankui = new BankUI();
        bankui.setVisible(true);
    }
    

}
