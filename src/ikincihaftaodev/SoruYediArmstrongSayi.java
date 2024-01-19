package ikincihaftaodev;

import java.util.Scanner;

public class SoruYediArmstrongSayi {
    public static String armstrongNumber(String num) {
        int digit = num.length();
        int total = 0;

        for (int i = 0; i < digit; i++) {
            int digitValue = Character.getNumericValue(num.charAt(i)); // karakterin sayısal değerini döndürür.
            total += Math.pow(digitValue, digit);
        }
        if (total == Integer.parseInt(num)) {       // num string değer olduğu integer'a parse ederiz
            return num + ": Armstrong sayıdır.";
        }else{
            return num + ": Armstrong sayı değildir.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        String number = sc.nextLine();

        System.out.println(armstrongNumber(number));

        sc.close();
    }
}
