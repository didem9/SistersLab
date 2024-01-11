package BirinciHaftaOdev;

import java.util.Scanner;

public class SoruDortHesapMak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double num1 = sc.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Bölen 0 olamaz.");
        }


    }
}
