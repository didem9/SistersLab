package ucuncuhaftaodev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoruDortSatisTakibi {
    public static void main(String[] args) {
        Map<String, Integer> salesTrackingList = new HashMap<>();

        salesTrackingList.put("Ayşe", 200);
        salesTrackingList.put("Ahmet", 600);

        calculateSalesAmount(salesTrackingList);
        comparisonCusotmer(salesTrackingList);
    }

    public static void calculateSalesAmount(Map<String, Integer> salesTrackingList){
        Scanner sc = new Scanner(System.in);
        int salesAmount;
        int extraSalesAmount;
        boolean isAdd = true;
        int totalAmount = 0;

        System.out.println("Satış miktarını görmek istediğiniz müşterinin adını girin: ");
        String customerName = sc.nextLine();

        if (salesTrackingList.containsKey(customerName)){
            salesAmount = salesTrackingList.get(customerName);
            while(isAdd){
                System.out.println("Satış miktarı: " + salesAmount + "\nSatış miktarı eklemek ister misiniz?\n" +
                        "1 - Evet\n2 - Hayır");
                int option;
                option = sc.nextInt();
                switch (option){
                    case 1:
                        System.out.print("Satış miktarını girin: ");
                        extraSalesAmount = sc.nextInt();
                        salesAmount += extraSalesAmount;
                        totalAmount += extraSalesAmount;
                        System.out.println(customerName + " için yapılan toplam satış: " +  salesAmount + "\n");
                        break;
                    case 2:
                        System.out.println(customerName + " için yapılan toplam satış: " +  salesAmount+ "\n");

                        break;
                    default:
                        System.out.println("Hatalı giriş.");
                }
                isAdd = false;
            }
        }else {
            System.out.println("Müşteri listede bulunmuyor.");
            System.out.print(customerName + " için yapılan satış miktarını girin: ");
            int amount = sc.nextInt();

            salesTrackingList.put(customerName, amount);

            System.out.println(customerName + ": " + amount + " listeye eklendi.");
        }

        for (Map.Entry<String, Integer> salesman: salesTrackingList.entrySet()){
            totalAmount += salesman.getValue();
        }
        System.out.println("Şirketin toplam satışı: " + totalAmount+ "\n");
        sc.close();
    }

    public static void comparisonCusotmer(Map<String, Integer> customer){
        String name = "";
        int maxSalesAmount = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> cust: customer.entrySet()){

            if (maxSalesAmount < cust.getValue()){
                maxSalesAmount = cust.getValue();
                 name = cust.getKey();
            }
        }
        System.out.println("En çok satış yapan müşteri: " + name);
    }
}
