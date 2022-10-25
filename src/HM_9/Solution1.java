package HM_9;

import java.util.ArrayList;

public class Solution1 {
    /*
    1. Create List of Strings
    2. Add 5 different strings
    3. Print to the console the size of the List
    4. Using loop, print all the items to the console from the List
     */


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        System.out.println("The size of the list is: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
