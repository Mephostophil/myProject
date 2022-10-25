package HM_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution9 {
    /*
    1. Create collection of HashMap<String, String>
    2. Put 10 Strings there
    3. Print the list of Keys, each key from the new line
     */

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("banana", "grass");
        hashMap.put("cherry", "berry");
        hashMap.put("pear", "fruit");
        hashMap.put("melon", "grass");
        hashMap.put("blackberry", "vegetable");
        hashMap.put("ginseng", "root");
        hashMap.put("strawberry", "berry");
        hashMap.put("toffee", "flower");
        hashMap.put("potato", "tuber");
        hashMap.put("tomato", "vegetable");

        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
