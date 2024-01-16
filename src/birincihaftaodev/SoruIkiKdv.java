package birincihaftaodev;

import java.util.Scanner;

public class SoruIkiKdv {
    public static void main(String[] args) {

        float kdvAmount1 = 0.10f;
        float kdvAmount2 = 0.22f;
        double moneyWithKdv;

        Scanner sc = new Scanner(System.in);

        System.out.print("Para miktarınızı girin: ");
        double moneyAmount = sc.nextDouble();

        System.out.println("Girilen miktar: " + moneyAmount);

        if (moneyAmount > 0 && moneyAmount < 1000) {

            moneyWithKdv = (moneyAmount * kdvAmount1) + moneyAmount;
            System.out.printf("KDV'li fiyat: " + "%.2f\n", moneyWithKdv);
            System.out.printf("KDV Tutarı: " + "%.2f\n", (moneyAmount * kdvAmount1));
        } else if (moneyAmount >= 1000) {

            moneyWithKdv = (moneyAmount * kdvAmount2) + moneyAmount;
            System.out.printf("KDV'li fiyat: " + "%.2f\n", moneyWithKdv);
            System.out.printf("KDV Tutarı: " + "%.2f\n", (moneyAmount * kdvAmount2));
        } else {
            System.out.println("Para miktarını kontrol edin.");
        }
    }
}