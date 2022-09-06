package HW_5;

import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */
    public static void main(String[] args) {
        //implement me
        String[] arrayString = ReverseArray.initializeStringArray();
        fillIntArray(arrayString);
    }

    public static void fillIntArray(String[] arrayString) {
        int[] arrayInt = new int[10];
        System.out.print("The array of the strings length: ");
        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = arrayString[i].length();
            System.out.print(arrayInt[i] + " ");
        }

    }
}
