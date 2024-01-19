package ikincihaftaodev;

import java.util.Scanner;

public class SoruBirFibonacci {
    public static int fibonacci(int number) {

        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = sc.nextInt();

        System.out.println(number + " terimli Fibonacci serisi: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}
