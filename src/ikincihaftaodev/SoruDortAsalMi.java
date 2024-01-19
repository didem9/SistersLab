package ikincihaftaodev;

import java.util.Scanner;

public class SoruDortAsalMi {
    public static boolean primeNumber(int num) {
        if (num <= 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = sc.nextInt();

        if (primeNumber(number)) {
            System.out.println(number + " asal sayıdır.");
        } else {
            System.out.println(number + " asal sayı değildir.");
        }
        sc.close();
    }
}
