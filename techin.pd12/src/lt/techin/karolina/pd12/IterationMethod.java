package lt.techin.karolina.pd12;

import java.util.Arrays;

public class IterationMethod {
    public static void main(String[] args) {
        int[] numberList = {2, 5, 8, 4, 2, 3};
        int length = numberList.length;

            int sum = 0;
        for (int i = 0; i<length; i++) {
            sum += numberList[i];

        }
        System.out.println("Masyvo elementu suma: " + sum);
        System.out.println("Masyvo elementu vidurkis: " + (sum/length));
    }
}
