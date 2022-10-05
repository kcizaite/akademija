package lt.techin.karolina.pd10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilnaDezute = 3;
        System.out.println("Puodeliu, kuriuos reikia supakuoti, skaicius: ");
        int turimiPuodeliai = input.nextInt();
//        Uzpildytu dezuciu su puodeliais skaicius
        int pilnuDezuciuSkaicius = 7 / 3;
        System.out.println("Pilnu dezuciu skaicius: " + pilnuDezuciuSkaicius);
//        Likusiu nepakuotu puodeliu skaicius
        int likePuodeliai = 7 % 3;
        System.out.println("Nesupakuotu puodeliu skaicius: " + likePuodeliai);
    }
}
