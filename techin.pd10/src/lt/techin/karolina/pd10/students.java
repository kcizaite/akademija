package lt.techin.karolina.pd10;

import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int math1 = (number1 + number2 + number3 + number4 + number5);
        int math2 = (math1 * 45);

        System.out.println("Paskaitu skaicius per savaite - " + math1);
        System.out.println("Tai sudaro " + math2 + " minuciu");
    }
}
