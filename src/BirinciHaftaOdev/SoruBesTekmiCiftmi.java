package BirinciHaftaOdev;

import java.util.Scanner;

public class SoruBesTekmiCiftmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " çift sayıdır.");
        } else {
            System.out.println(number + " tek sayıdır.");
        }
    }
}
