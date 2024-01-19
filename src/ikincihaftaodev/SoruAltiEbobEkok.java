package ikincihaftaodev;

import java.util.Scanner;

public class SoruAltiEbobEkok {
    public static int ebob(int number1, int number2) {
        int ebob = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {

            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static int ekok(int number1, int number2) {
        int ekok;

        ekok = (number1 * number2) / ebob(number1, number2);

        return ekok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num1 = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " ve " + num2 + " sayılarının ebob'u: " + ebob(num1, num2));
        System.out.println(num1 + " ve " + num2 + " sayılarının ekok'u: " + ekok(num1, num2));

        sc.close();
    }
}
