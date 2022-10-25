package HM_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution11 {
    /*
    1. Create collection of HashMap<String, Object>
    2. Put 10 Strings there
    3. Print the map, each pair from new line
    Example:
        Sim - 5
     */

    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("banana", "5");
        hashMap.put("cherry", "1");
        hashMap.put("pear", "2");
        hashMap.put("melon", "3");
        hashMap.put("blackberry", "4");
        hashMap.put("ginseng", "7");
        hashMap.put("strawberry", "6");
        hashMap.put("toffee", "9");
        hashMap.put("potato", "0");
        hashMap.put("tomato", "8");


        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
