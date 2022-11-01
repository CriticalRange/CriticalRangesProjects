import javax.swing.*;
import java.lang.Math;

public class howmanytimes {
    public static void main(String[] args) {

        int numara;
        int numara2;
        String girdi;
        int count = 0;
        int maxTries = 3;

    while (true) {
        try {
            girdi = JOptionPane.showInputDialog("Lütfen karesi alınacak sayıyı yazın: ");
            numara = Integer.parseInt(girdi); // Karesi alınacak sayı alındı.
            girdi = JOptionPane.showInputDialog("Lütfen sayının üssünü yazın: ");
            numara2 = Integer.parseInt(girdi); // Sayının üssü bilgisi alındı.
            int kare = (int)Math.pow(numara, numara2);
            JOptionPane.showMessageDialog(null, "Sayınız: " + kare);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Lütfen bir sayı girin!");
            if (++count == maxTries) throw ex;
        }
    }



    }
}
