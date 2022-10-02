package skaiciuotuvas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pirmasis skaicius: ");
        int pirmas = Integer.parseInt(input.next());
        System.out.print("Antrasis skaicius: ");
        int antras = Integer.parseInt(input.next());
        System.out.print("Veiksmas: ");
        int resultatas = 0;
        char operatorius = input.next().charAt(0);
        switch (operatorius) {
            case '+':
                resultatas = pirmas + antras;
                break;
            case '-':
                resultatas = pirmas - antras;
                break;
            case '*':
                resultatas = pirmas * antras;
                break;
            case '/':
                resultatas = pirmas / antras;
                break;
        }
        System.out.println("Result:" + resultatas);
    }
}


