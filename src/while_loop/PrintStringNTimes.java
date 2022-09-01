package while_loop;

import java.util.Scanner;

public class PrintStringNTimes {
    /*
    Enter from the console a string and a number
    Print string n times
    using loop while
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.close();
        int i = 0;
        while (i < n) {
            System.out.println(s);
            i++;
        }

    }
}
