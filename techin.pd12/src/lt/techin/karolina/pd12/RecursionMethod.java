package lt.techin.karolina.pd12;

public class RecursionMethod {
    public static void main(String args[]) {
        int numberList[] = {2, 5, -8, 4, 2, 3};
        int number = numberList.length;

        System.out.println(findMin(numberList, number));
    }

    public static int findMin(int numberList[], int number) {
        if (number == 1)
            return numberList[0];
        return Math.min(numberList[number - 1], findMin(numberList, number - 1));
    }
}


