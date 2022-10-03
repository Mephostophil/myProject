package HW_5;

import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        //implement me

        String[] arrayString = initializeStringArray();
        System.out.println("your array in reverse order:");
        reverseArrayOrder(arrayString);

    }

    public static String[] initializeStringArray() {
        String[] arrayString = new String[10];
        System.out.println("Please, enter 10 strings");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = scanner.nextLine();
        }

        return arrayString;
    }

    public static void reverseArrayOrder(String[] arrayString) {
        for (int i = arrayString.length - 1; i >= 0; i--) {
            System.out.println(arrayString[i]);
        }
    }
}
