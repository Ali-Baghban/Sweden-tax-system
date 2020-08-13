import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        int more = 0;
        int income = 0;
        float tax = 0;
        boolean cont = true;
        while (cont) {
            try {
                String str = JOptionPane.showInputDialog("Enter your income ");
                income = Integer.parseInt(str);
                if (income < 1230) {
                    JOptionPane.showMessageDialog(null, "You have not to pay tax");
                } else {
                    tax = income * 30 / 100;
                    JOptionPane.showMessageDialog(null, "Your Annual tax : " + tax + " $");
                }
                more = JOptionPane.showConfirmDialog(null, "Would you like to calculate another one's tax ?");

                if (more == 0) {
                    cont = true;
                } else {
                    cont = false;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        System.exit(0);
    }
}
