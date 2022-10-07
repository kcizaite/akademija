package lt.techin.karolina.pd12;

import java.util.ArrayList;
import java.util.List;

public class StudentuPazymiai {
    public static void main(String[] args) {
        int[] pazymiai = {1, 5, 8, 7, 10, 9, 9, 8, 7, 7, 4, 6, 8};
        List skaiciausProcentas = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int skaicius = 0;
            for (int j : pazymiai) {
                if (j == i) {
                    skaicius++;
                }
            }
            skaiciausProcentas.add(i + "-" + String.format("%.2f", (100.0 * skaicius / pazymiai.length)) + "%");
        }
        System.out.println(skaiciausProcentas);

    }
}
