package birincihaftaodev;

import java.util.Scanner;

public class SoruYediHavaDurumu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Hava durumu kodunu girin:
                1: Güneşli
                2: Yağmurlu
                3: Karlı""");
        int code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("Bugün hava güneşli");
                break;
            case 2:
                System.out.println("Bugün hava yağmurlu");
                break;
            case 3:
                System.out.println("Bugün hava kar yağışlı");
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız.");
        }
    }
}
