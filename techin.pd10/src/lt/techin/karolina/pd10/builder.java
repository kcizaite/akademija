package lt.techin.karolina.pd10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class builder {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
//        Apskaiciuojamas plytu kiekis
        System.out.println("Sienos ilgis metrais: ");
        int a = input.nextInt();
        System.out.println("Sienos aukstis metrais: ");
        int h = input.nextInt();
        int turimosPlytosIlgis = 20;
        int turimosPlytosAukstis = 10;
        int plytuKiekis = (((a * 100) / 20) * ((h * 100) / 10));

        System.out.println("Plytu kiekis " + plytuKiekis);

//        Apskaiciuojame plytu kaina
        System.out.println("Plytos kaina Eur: ");
        double kaina = input.nextDouble();
        double plytuKaina = (kaina * plytuKiekis);

        System.out.println("Plytos kainuos " + df.format(plytuKaina) + " Eur");
    }
}
