package HM_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the longest string in the List
    4. Print to the console found string
    5. If there are several longest strings, print each of them.
     */


    public static void main(String[] args) {
        String biggestString = "";

        System.out.println("Please, enter 5 strings separated by 'Enter' button");
        ArrayList<String> list = fillList();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > biggestString.length()) {
                biggestString = list.get(i);
            }
        }

        System.out.println("The biggest string is: " + biggestString);
    }

    public static ArrayList<String> fillList() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        return list;
    }
}