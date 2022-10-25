package HM_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution12 {
    /*
    1. Create Set<Integer>
    2. Add there 20 different numbers
    3. Remove from the set all the numbers bigger than 10
     */

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            mySet.add(i);
        }

        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) iterator.remove();
        }


        System.out.println(mySet);
    }
}
