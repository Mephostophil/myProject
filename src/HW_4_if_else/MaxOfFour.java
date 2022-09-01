package HW_4_if_else;

import java.util.Scanner;

public class MaxOfFour {
    /*
    Enter and reed four numbers from the console
    Implement method which prints max of four variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        printMaxOfFour(one, two, three, four);
        scanner.close();
    }

    private static void printMaxOfFour(int one, int two, int three, int four) {
        int[] array = new int[]{one, two, three, four};
        for (int i = 0; i < 4; i++) {
            if (array[0] < array[i]) {
                array[0] = array[i];
            }
        }
        System.out.println(array[0]);
    }
}

