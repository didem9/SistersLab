package ikincihaftaodev;

import java.util.Scanner;

public class SoruUcPermutasyon {

    public static int factorial(int num) {
        int fact = 1;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }
        return fact;
    }

    public static int permutation(int num, int r) {

        return factorial(num) / factorial(num - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Toplam eleman sayıyısını girin: ");
        int number = sc.nextInt();
        System.out.print("Seçilecek eleman sayısını girin: ");
        int r = sc.nextInt();
        System.out.println("P(" + number +", " +r + ") = " + permutation(number, r));

        sc.close();
    }
}
