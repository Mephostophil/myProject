package HW_11;

import java.util.Scanner;

public class Solution {
    /*
    1. Create the custom exception and extend it from IllegalArgumentException class
    2. Create the method which takes and integer value and print it to the console
    3. In the method check if an integer is less than 0, throw your custom exception
    4. The method should throw this custom exception
    5. Exception should pass the message into the super class in the constructor - "The value should be more than zero"
    6. In method main call this method and:
        6.1. call this method with int > 0
        6.2. using try catch block pass int < 0, catch this exception and print to the console "Exception was caught"
        6.3. call this method with int < 0
     */

    public static void main(String[] args) {
        //'method' takes >0
        method(1);

        System.out.println("New value, please...");

        //'method' takes <0
        try {
            method(-1);
        } catch (MyException e) {
            System.out.println("Exception was caught");
        }

    }

    public static void method(Integer value) {
        if (value < 0) {
            throw new MyException("The value should be more than 0");
        }
        System.out.println(("You entered: " + value));
    }
}