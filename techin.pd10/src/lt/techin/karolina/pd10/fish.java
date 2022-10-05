package lt.techin.karolina.pd10;

import java.util.Scanner;

public class fish {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kiek zuvu gyvena akvariume? ");
        int a = input.nextInt();
        System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena? ");
        int b = input.nextInt();
        System.out.println("Kiek dienu praejo? ");
        int n = input.nextInt();
        int visoZuvuSkaicius = (a+(b*n));
        System.out.println("Po " + n + " dienu akvariume gyvens " + visoZuvuSkaicius + " zuvu.");

    }
}
