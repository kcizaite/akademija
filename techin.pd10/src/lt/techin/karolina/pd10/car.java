package lt.techin.karolina.pd10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
//        Tunelio ilgis 264m pakeiciamas i 0.264km
        double tunelioIlgis = 0.264;
        System.out.println("Koks automobilio greitis? ");
        double greitis = input.nextInt();
//        Apskaiciuojame keliones laika sekundemis simtuju tikslumu
        double laikas = ((0.264 / greitis) * 3600);
        System.out.println("Automobilis tuneli pravaziuos per " + df.format(laikas) + " s");

    }
}
