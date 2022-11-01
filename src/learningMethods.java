import javax.swing.*;

public class learningMethods {

    public static void main(String[] args) {

        int numberTaken;

        String input = JOptionPane.showInputDialog("Please enter the number to get square of it!");
        numberTaken = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your number is: " + Squared(numberTaken));
        JOptionPane.showMessageDialog(null, "Poggers!");
    }

    public static int Squared (int number) {
        return number *number;

    }
}
