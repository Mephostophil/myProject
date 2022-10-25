package HM_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution6 {
    /*
    1. Create collection HashSet with type <String>
    2. Put 10 strings (banana, cherry, pear, melon, blackberry, ginseng, strawberry, toffee, potato)
    3. Print to the console this collection, each element from new line
    4. Pay attention to the order changed order of the strings
     */

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String[] stringArray = new String[]{"banana", "cherry", "pear", "melon", "blackberry", "ginseng", "strawberry", "toffee", "potato"};
        hashSet.addAll(List.of(stringArray));

        for (String i : hashSet) {
            System.out.println(i);
        }
    }
}