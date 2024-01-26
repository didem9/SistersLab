package ucuncuhaftaodev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoruBirOgrenciNotlari {
    public static void main(String[] args) {
        Map<String, Integer> studentExamMark = new HashMap<>();

        studentExamMark.put("Ali", 70);
        studentExamMark.put("Ayşe", 88);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("""
                    Yapmak istediğiniz işlemi seçin.
                    1 - Öğrenci Ekleme
                    2 - Not Sorgulama
                    3 - Sınav sonucu listesini görüntüle
                    0 - Çıkış
                    Seçiminiz:
                    """);

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNote(studentExamMark);
                    break;
                case 2:
                    queryGrade(studentExamMark);
                    break;
                case 3:
                    examScoreList(studentExamMark);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }
        } while (choice != 0);
        sc.close();
    }

    public static void addNote(Map<String, Integer> studentExamMark) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Öğrencinin adını girin: ");
        String name = sc.nextLine();

        System.out.print("Öğrencinin notunu girin: ");
        int score = sc.nextInt();

        studentExamMark.put(name, score);
        System.out.println("\n" +name + ", sınav sonucu " + score + " olarak listeye eklendi.\n");
    }

    public static void queryGrade(Map<String, Integer> studentExamMark) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nÖğrencinin adını girin: ");
        String name = sc.nextLine();

        Integer note = studentExamMark.get(name);

        if (note != null) {
            System.out.println("Öğrenci adı: " + name + "\n" + "Sınav sonucu: " + note + "\n");
        } else {
            System.out.println("Öğrenci bulunamadı !!\n");
        }
    }

    public static void examScoreList(Map<String, Integer> studentExamScore) {

        System.out.format("%n| %-15s | %-15s |%n",
                "Ad ", "Sınav Sonucu");
        System.out.println(" ");
        for (Map.Entry<String, Integer> student : studentExamScore.entrySet()) {  //map içindeki tüm girişleri küme olarak döndürür.
            System.out.format("| %-15s | %-15s |%n",
                    student.getKey(), student.getValue());
        }
        System.out.println(" ");
    }
}
