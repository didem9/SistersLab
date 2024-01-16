package birincihaftaodev;

import java.util.Scanner;

public class SoruSekizHesapMak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double num1 = sc.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = sc.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:\n+, -, *, /");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                } else {
                    System.out.println("Bölen sıfır olamaz.");
                }
                break;
            default:
                System.out.println("Hatalı operatör girdiniz.");
        }
    }
}
