package PasswordValidatorApp;

import javax.swing.JOptionPane;

public class PasswordValidatorApp {

  public static void main(String[] args) {

        String input;
        input = JOptionPane.showInputDialog("Enter your password: ");
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigits = false;
        boolean hasSpecialChar = false;

        int passLength = input.length();

        for (int i = 0; i < passLength; i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigits = true;
            } else {
                hasSpecialChar = true;
            }

        }

        if (hasUppercase && hasLowercase && hasDigits && hasSpecialChar)
                 {
            JOptionPane.showMessageDialog(null, "Password accepted!");} 
        else if (!hasUppercase || !hasLowercase && hasDigits && !hasSpecialChar)
                 {
            JOptionPane.showMessageDialog(null, "*Password requires uppercase + lowercase letters,"
                    + " a digit, and special character*");} 
        else if (hasUppercase && hasLowercase && !hasDigits && hasSpecialChar)
                 {
            JOptionPane.showMessageDialog(null, "*Password requires at least 1 digit*");} 
        else if (hasUppercase && hasLowercase && hasDigits && !hasSpecialChar)
                 {
            JOptionPane.showMessageDialog(null, "*Password requires at least 1 special character*");}         
        else {
            JOptionPane.showMessageDialog(null, "*Password incorrectly formatted; please ensure a combination of the"
                    + " following: uppercase, lowercase, digit, and special character to continue*");
        }
      
  }
}
