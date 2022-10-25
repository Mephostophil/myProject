package HM_9;

import java.util.HashMap;

public class Solution7 {
    /*
    1. Create collection HashMap<String, String>
    2. Put there 10 pairs:
        banana - grass,
        cherry - berry,
        pear - fruit,
        melon - vegetable,
        blackberry - berry,
        ginseng - root,
        strawberry - berry,
        toffee - flower,
        potato - tuber
     3. Print all the collection to the console, each element from the new line
     Example:
        banana - grass
     */


    public static void main(String[] args) {
        HashMap <String, String> hashMap = new HashMap<>();
        hashMap.put("banana", "grass");
        hashMap.put("cherry", "berry");
        hashMap.put("pear", "fruit");
        hashMap.put("melon", "grass");
        hashMap.put("blackberry", "vegetable");
        hashMap.put("ginseng", "root");
        hashMap.put("strawberry", "berry");
        hashMap.put("toffee", "flower");
        hashMap.put("potato", "tuber");

        for(HashMap.Entry<String, String> entry: hashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
