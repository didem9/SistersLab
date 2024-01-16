package birincihaftaodev;

import java.util.Scanner;

public class SoruDokuzGeometrikAlan {
    public static void main(String[] args) {

        double length;
        double height;
        double width;

        Scanner sc = new Scanner(System.in);

        System.out.println("Alanını hesaplamak istediğiniz geometrik şekli seçin: ");
        System.out.println("1: Dikdörtgen\n2: Kare\n3: Üçgen");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.print("Dikdörtgenin boyutlarını girin:\nUzunluk: ");
                length = sc.nextInt();
                System.out.print("Genişlik: ");
                width = sc.nextInt();

                System.out.println("Dikdörtgenin alanı:" + (length * width) );
                break;
            case 2:
                System.out.print("Karenin kenar uzunluğunu girin:\nUzunluk: ");
                length = sc.nextInt();

                System.out.println("Karenin alanı:" + (length * length) );
                break;
            case 3:
                System.out.print("Üçgenin kenar uzunluklarını girin:\nTaban uzunluğu: ");
                length = sc.nextInt();

                System.out.print("Yükseklik: ");
                height = sc.nextInt();

                System.out.println("Üçgenin alanı:" + ((length * height) / 2) );
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
        }
    }
}
