package lt.techin.karolina.pd11;

import java.util.Arrays;
import java.util.Scanner;

public class VilniusPanevezysAutobusas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite kiek autobusu vyksta kasdien: ");
        int autobusuKiekis = input.nextInt();

//        Autobusu laiko valandomis input
        int[] autobusuLaikasVal = new int[autobusuKiekis];
        for (int i = 0; i < autobusuKiekis; i++) {
            System.out.println((i + 1) + " autobuso vaziavimo laikas val: ");
            int laikasVal = input.nextInt();
            autobusuLaikasVal[i] = laikasVal * 60;
        }
//        Autobusu laiko minutemis input
        int[] autobusuLaikasMin = new int[autobusuKiekis];
        for (int i = 0; i < autobusuKiekis; i++) {
            System.out.println((i + 1) + " autobuso vaziavimo laikas min: ");
            int laikasMin = input.nextInt();
            autobusuLaikasMin[i] = laikasMin;
        }
//        Autobusu keleiviu skaiciaus input
        int autobusuKeleiviai = 0;
        int autobusaiMaziauDesimt = 0;
        for (int i = 0; i < autobusuKiekis; i++) {
            System.out.println((i + 1) + " autobusas perveza keleiviu: ");
            int keleiviai = input.nextInt();
            autobusuKeleiviai += keleiviai;
            if (keleiviai < 10) {
                autobusaiMaziauDesimt++;
            }
        }
//        Laiko vidurkio skaiciavimai
        int sumaVal = (Arrays.stream(autobusuLaikasVal).sum());
        int sumaMin = (Arrays.stream(autobusuLaikasMin).sum());
        int laikoVidurkis = ((sumaVal + sumaMin) / autobusuKiekis);

        System.out.println("Bendrai perveztu keleiviu skaicius = " + autobusuKeleiviai);
        System.out.println("Vidutinis sugaistas vaziavimo laikas (min.): " + laikoVidurkis);
        System.out.println("Autobusu skaicius (keleivei<10): " + autobusaiMaziauDesimt);

    }
}
