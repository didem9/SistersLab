package ucuncuhaftaodev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class SoruIkiCiftSayilariFiltreleme {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println("Rastgele sayıların listesi: " + list);
        evenOrOdd(list);
    }

    public static void evenOrOdd(List<Integer> list) {

        HashSet<Integer> evenNumbers = new HashSet<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Çift sayıların listesi: " + evenNumbers);
        System.out.println("Tek sayıların listesi: " + oddNumbers);
    }
}
