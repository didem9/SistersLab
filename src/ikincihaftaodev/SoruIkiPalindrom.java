package ikincihaftaodev;

import java.util.Scanner;

public class SoruIkiPalindrom {
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kontrolü istenen kelimeyi girin: ");
        String word = sc.nextLine();

        if(palindrome(word)){
            System.out.println(word + " kelimesi palindrom kelimedir.");
        }else {
            System.out.println(word + " kelimesi palindrom değildir.");
        }
        sc.close();
    }
}
