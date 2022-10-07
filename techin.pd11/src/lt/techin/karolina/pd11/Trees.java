package lt.techin.karolina.pd11;

import java.util.Arrays;
import java.util.Scanner;

public class Trees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta? ");
        int egluciuKiekis = input.nextInt();

        double[] egluciuAuksciai = new double[egluciuKiekis];

        for (int i = 0; i < egluciuKiekis; i++) {
            System.out.println("Iveskite " + (i + 1) + " eglutes auksti");
            double eglute = input.nextDouble();
            egluciuAuksciai[i] = eglute;
        }

        System.out.println("Eglutes aukscio vidurkis: "
                + (Arrays.stream(egluciuAuksciai).average().getAsDouble()) + " cm");

    }
}
