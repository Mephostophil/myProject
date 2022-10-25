package HM_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution5 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Remove the last element and put it to the beginning of the List, Repeat 13 times
    4. Using loop, print all the items to the console from the List
     */


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 5 strings separated by 'Enter' button");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        sortAndPrint(list);
    }


    public static void sortAndPrint(ArrayList<String> list) {
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        System.out.println();
        System.out.println("Your list: " + list);

    }
}
