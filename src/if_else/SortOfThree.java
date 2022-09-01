package if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        int[] array = new int[]{a, b, c};
        int buffer = 0;
        boolean r = true;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    r = false;
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                }
                else r = true;
            }
        }
        while (!r);

        for (int i = 0;i<array.length;i++)
        {
            System.out.print(array[i] + "  ");
        }
    }
}

