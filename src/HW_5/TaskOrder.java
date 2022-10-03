package HW_5;


import java.util.Scanner;

public class TaskOrder {
    /*
    MaxOf20
    ReverseArray
    TwoArrays
    DivideArray
     */
    public static void main(String[] args) {
        int[] array = DivideArray.initializeIntArray();
        //Max Of 20
        int maxNumber = MaxOf20.max(array);
        System.out.println("Max number is: " + maxNumber);


        //ReverseArray
        String[] arrayString = ReverseArray.initializeStringArray();
        System.out.println("your array in reverse order:");
        ReverseArray.reverseArrayOrder(arrayString);
        System.out.println();

        //TwoArrays
        TwoArrays.fillIntArray(arrayString);
        System.out.println();

        //DivideArray:
        DivideArray.arraySeparator(array);

    }

}
