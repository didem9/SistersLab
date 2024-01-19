package ikincihaftaodev;

import java.util.Scanner;

public class SoruBesHesapMakinesi {

    public static boolean calculator(char opr,double numb1, double numb2){
        switch (opr) {
            case '+':
                addition(numb1, numb2);
                break;
            case '-':
                subtraction(numb1, numb2);
                break;
            case '*':
                multiplication(numb1, numb2);
                break;
            case '/':
                division(numb1, numb2);
                break;
            default:
                System.out.println("Hatalı operatör girdiniz.");
        }
        return false;
    }

    public static void addition(double firstNumber, double secondNumber) {
        double total = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + total);
    }

    public static void subtraction(double firstNumber, double secondNumber) {
        double diff = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + diff);
    }

    public static void multiplication(double firstNumber, double secondNumber) {
        double product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
    }

    public static void division(double firstNumber, double secondNumber) {

        if (secondNumber != 0) {
            double result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else {
            System.out.println("Bölen sıfır olamaz.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double num1 = sc.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = sc.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:\n+, -, *, /");
        char operator = sc.next().charAt(0);

        System.out.println(calculator(operator, num1, num2));
    }
}
