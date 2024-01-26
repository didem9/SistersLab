package ucuncuhaftaodev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SorUcOyuncuPuanlari {
    public static void main(String[] args) {
        Map<String, Integer> playerPointList = new HashMap<>();

        playerPointList.put("Veli", 40);
        playerPointList.put("did", 50);

        Scanner sc = new Scanner(System.in);
        int preference;

        do {
            System.out.print("""
                    Yapmak istediğiniz işlemi seçin.
                                        
                    1 - Oyuncu ve puan ekleme
                    2 - Oyuncuya göre puan görüntüleme
                    3 - Puan tablosunu görüntüleme
                    0 - Çıkış
                                        
                    Seçiminiz:
                    """);
            preference = sc.nextInt();

            switch (preference) {
                case 1:
                    addPoints(playerPointList);
                    break;
                case 2:
                    pointDisplay(playerPointList);
                    break;
                case 3:
                    playerList(playerPointList);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Tekrar deneyin.");
            }
        } while (preference != 0);
        sc.close();
    }

    public static void addPoints(Map<String, Integer> additionPoint) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nOyuncunun adını girin:");
        String playerName = sc.nextLine();

        if (additionPoint.containsKey(playerName)) {

            int currentScore = additionPoint.get(playerName);
            System.out.print("\n" + playerName + " oyuncusunun mevcut puanı: " + currentScore +
                    "\nEklenecek puanı girin: ");
            int addedScore = sc.nextInt();
            currentScore += addedScore;

            additionPoint.put(playerName, currentScore);
            System.out.println(playerName + " oyuncusunun puanı " + currentScore + " olarak güncellenmiştir.");
        } else {
            System.out.println("Girilen isim listede bulunmuyor");
            System.out.print(playerName + " için eklenecek puanı girin: ");
            int addedScore = sc.nextInt();

            additionPoint.put(playerName, addedScore);

            System.out.println(playerName + ": " + addedScore + " listeye eklendi.");
        }
        System.out.println("\n-------------------------------------");
    }

    public static void pointDisplay(Map<String, Integer> players) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Puanını görmek istediğiniz oyuncunun adını girin:");
        String name = sc.nextLine();

        if (players.containsKey(name)) {
            int score = players.get(name);
            System.out.println(name + " oyuncusunun puanı: " + score);
        } else {
            System.out.println("Bu oyuncuya ait puan listede bulunmaktadır.");
        }
        System.out.println("\n------------------------------------ ");
    }

    public static void playerList(Map<String, Integer> players) {
        System.out.format("|%-15s%-15s%n", "Oyuncu Adı", "Oyuncu Puanı");

        for (Map.Entry<String, Integer> player : players.entrySet()) {
            System.out.format("|%-15s%-15d%n", player.getKey(), player.getValue());
        }
        System.out.println("\n-------------------------------------");
    }
}
