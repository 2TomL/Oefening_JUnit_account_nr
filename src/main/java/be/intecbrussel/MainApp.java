package be.intecbrussel;

import com.sun.tools.javac.Main;

public class MainApp {
    public static void main(String[] args) {
        Account account = new Account("967-2514532-89");

        try {
            boolean isFormatCorrect = account.checkAccountNumberPattern();
            System.out.println("Account number format is correct: " + isFormatCorrect);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
