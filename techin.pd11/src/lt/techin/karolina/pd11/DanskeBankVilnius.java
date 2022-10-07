package lt.techin.karolina.pd11;

import java.util.Arrays;
import java.util.Scanner;

public class DanskeBankVilnius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kiek dalyvavo begiku? ");
        int begikuKiekis = input.nextInt();

        int[] begikuLaikas = new int[begikuKiekis];

        for (int i = 0; i < begikuKiekis; i++) {
            System.out.println("Iveskite " + (i + 1) + " begiko laika: ");
            int begikas = input.nextInt();
            begikuLaikas[i] = begikas;
        }

        int min = (Arrays.stream(begikuLaikas).min()).getAsInt();
        double vidurkis = (Arrays.stream(begikuLaikas).average().getAsDouble());
        double skirtumas = vidurkis - min;

        System.out.println("Greiciausio begiko laikas: " + min + " sek.");
        System.out.println("Jis buvo: " + Math.round(skirtumas) + " sek greitesnis uz vidurki.");

    }
}
