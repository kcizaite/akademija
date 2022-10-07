package lt.techin.karolina.pd12;

import java.util.Scanner;

public class Moliugeliai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kiek turite moliugu: ");
        int moliuguKiekis = input.nextInt();
        System.out.println("Koks yra maziausias priimamu moliugu svoris: ");
        double maziausiasPriimamamasSvoris = input.nextDouble();
        System.out.println("Koks yra didziausias priimamu moliugu svoris: ");
        double didziausiasPriimamamasSvoris = input.nextDouble();
        double moliuguSvoris = 0;
        double atrinktuMoliuguKiekis = 0;
        double vidurkisAtrinktu = 0;
        for (int i = 0; i < moliuguKiekis; i++) {
            System.out.println("Iveskite " + (i + 1) + " moliugo svori: ");
            double moliugas = input.nextDouble();
            moliuguSvoris += moliugas;
            if ((moliugas > maziausiasPriimamamasSvoris) & (moliugas < didziausiasPriimamamasSvoris)) {
                atrinktuMoliuguKiekis++;
                vidurkisAtrinktu += moliugas;
            }
        }

        System.out.println("Visu moliugu vidutinis svoris: " + (moliuguSvoris / moliuguKiekis) + " kg");
        System.out.println("I supirkima atrinkta moliugu: " + Math.round(atrinktuMoliuguKiekis));
        System.out.println("Vidutinis vieno atrinkto moliugo svoris: "
                + (vidurkisAtrinktu / atrinktuMoliuguKiekis) + " kg");

    }
}

