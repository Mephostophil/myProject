package HW_5;

import java.util.Scanner;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = DivideArray.initializeIntArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);
    }

    public static int max(int[] array) {
        // implement me
        for (int i = 0; i < array.length-1; i++) {
            if (array[0]<array[i+1])
                array[0]=array[i+1];
        }
        return array[0];
    }
}
