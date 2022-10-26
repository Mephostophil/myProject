package HM_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the shortest string in the List
    4. Print to the console found string
    5. If there are several shortest strings, print each of them.
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listOfMinStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 5 strings separated by 'Enter' button");
        int minLength = 0;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
            if (i == 0) {
                minLength = list.get(i).length();
                continue;
            }
            if (minLength > list.get(i).length()) {
                minLength = list.get(i).length();
                listOfMinStrings.clear();
                listOfMinStrings.add(list.get(i));
            } else if (minLength == list.get(i).length()) {
                listOfMinStrings.add(list.get(i));
            }
        }

        System.out.println("The shortest string(s): ");
        for (int i = 0; i < listOfMinStrings.size(); i++) {
            System.out.println(listOfMinStrings.get(i));
        }
    }
}