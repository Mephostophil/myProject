package HW_5;

import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        // implement me
        int[] array = initializeIntArray();
        arraySeparator(array);
    }

    public static int[] initializeIntArray() {
        // implement me
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 20 numbers space separated");
        String stringArray[] = scanner.nextLine().split(" ");

        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }
    public static void arraySeparator(int[] array) {
        int[] firstArray = new int[array.length / 2];
        int[] secondArray = new int[array.length / 2];

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2)
                firstArray[i] = array[i];
            else secondArray[i - (array.length / 2)] = array[i];
        }
        System.out.println("Second small array is: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]+" ");
        }
    }

}
