package BirinciHaftaOdev;

import java.util.Scanner;

public class SoruUcNotHesabi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sınav notunuzu girin: ");
        double grade = sc.nextDouble();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Notunuz: AA");
        } else if (grade >= 80) {
            System.out.println("Notunuz: BA");
        } else if (grade >= 70) {
            System.out.println("Notunuz: BB");
        } else if (grade >= 60) {
            System.out.println("Notunuz: CB");
        } else if (grade >= 50) {
            System.out.println("Notunuz: CC");
        } else if (grade >= 0) {
            System.out.println("Notunuz: FF");
        } else {
            System.out.println("Geçerli not girin.");
        }
    }
}
