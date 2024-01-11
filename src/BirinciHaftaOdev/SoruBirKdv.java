package BirinciHaftaOdev;

import java.util.Scanner;

public class SoruBirKdv {
    public static void main(String[] args) {

        float kdvAmount = 0.3f;
        double moneyWithKdv;

        Scanner sc = new Scanner(System.in);

        System.out.print("Para miktarınızı girin: ");
        double moneyAmount = sc.nextDouble();

        if (moneyAmount > 0) {
            moneyWithKdv = (moneyAmount * kdvAmount) + moneyAmount;

            System.out.println("KDV'siz Fiyat: " + moneyAmount);
            System.out.printf("KDV'li fiyat: " + "%.2f\n", moneyWithKdv);
            System.out.printf("KDV Tutarı: " + "%.2f\n", (moneyAmount * kdvAmount));
        } else {
            System.out.println("Para miktarını kontrol edin.");
        }
    }
}
