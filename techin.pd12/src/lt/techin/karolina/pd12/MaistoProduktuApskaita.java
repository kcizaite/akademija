package lt.techin.karolina.pd12;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MaistoProduktuApskaita {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double[] kainos = {102.56, 215.72, 99.21, 200, 175.99, 214.99};
        double vidurkis = Arrays.stream(kainos).average().getAsDouble();
        System.out.println("Vidutiniskai viena preke kainavo: " + df.format(vidurkis) + " Eur");
        System.out.println("Per diena pardave perkiu uz " + (Arrays.stream(kainos).sum()) + " Eur");
    }
}
