import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Atamalar:
        double ilkNumara;
        double ikinciNumara;
        String girdi;
        String işlem;
        char işlemNumarası;
        // --------------------------------------------------------------
        girdi = JOptionPane.showInputDialog("Lütfen iki sayı değerini hesaplamak için ilk numarayı girin: ");
        ilkNumara = Double.parseDouble(girdi); // İlk numara alındı!
        işlem = JOptionPane.showInputDialog("Minimum numara miktarı kabul edildi.\nLütfen yapmak istediğiniz işlemi seçin (+,-,*,/): ");
        işlemNumarası = işlem.charAt(0); // İşlem türü alındı
        girdi = JOptionPane.showInputDialog("İşlem türü kabul edildi.\nLütfen ikinci numarayı girin: ");
        ikinciNumara = Double.parseDouble(girdi); // İkinci numara alındı!
        // --------------------------------------------------------------
        double toplama = ilkNumara + ikinciNumara; // Toplama
        double çıkarma = ilkNumara - ikinciNumara; // Çıkarma
        double çarpma = ilkNumara * ikinciNumara; // Çarpma
        double bölme = ilkNumara / ikinciNumara; // Bölme
        // --------------------------------------------------------------

        switch (işlemNumarası) {
            case ('+'):
            JOptionPane.showMessageDialog(null, "İşleminiz:" + ilkNumara + işlem + ikinciNumara + "=" + toplama);
            break;
            case ('-'):
            JOptionPane.showMessageDialog(null, "İşleminiz:" + ilkNumara + işlem + ikinciNumara + "=" + çıkarma);
            break;
            case ('*'):
            JOptionPane.showMessageDialog(null, "İşleminiz:" + ilkNumara + işlem + ikinciNumara + "=" + çarpma);
            break;
            case ('/'):
            JOptionPane.showMessageDialog(null, "İşleminiz:" + ilkNumara + işlem + ikinciNumara + "=" + bölme);
            break;
        }



            System.exit(0);
        }
    }
