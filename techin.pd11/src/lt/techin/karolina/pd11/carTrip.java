package lt.techin.karolina.pd11;

import java.util.Scanner;

public class carTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite kuro bako talpa: ");
        int kuroBakas = input.nextInt();
        System.out.println("Iveskite kuro sanaudas n: ");
        int kuroSanaudos = input.nextInt();

        double veiksmas = (kuroBakas/(kuroSanaudos*1.5));
        System.out.println("Keliauti bus galima " + Math.round(veiksmas) + " dienas.");
    }
}
