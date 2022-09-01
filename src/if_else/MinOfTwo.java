package if_else;

import java.util.Scanner;

public class MinOfTwo {
    /*
    Enter and reed two numbers from the console
    Implement method which prints the lowest variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        printMinOfTwo(one, two);
        scanner.close();
    }

    private static void printMinOfTwo(int a, int b) {
        if (a < b) System.out.println("The lowest variable is: " + a);
        else if (a > b) System.out.println("The lowest variable is: " + b);
        else System.out.println("The numbers are equal");
    }
}
