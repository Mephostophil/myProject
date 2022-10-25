package HM_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution13 {
    /*
    1. Create Map<String, String>
    2. Put there 10 elements (key-Surname, value-Name)
    3. Remove people who have the same names
    4. Print the result, each element from new line
     */
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("Gorobec", "Ihor");
        myMap.put("Smirnov", "Anton");
        myMap.put("Perepelycya", "Maxym");
        //
        myMap.put("Bulba", "Taras");
        myMap.put("Gyrya", "Taras");
        //
        myMap.put("Kononenko", "Artem");
        myMap.put("Stryy", "Artem");
        //
        myMap.put("Bugai", "Volodymyr");
        myMap.put("Popov", "Olexandr");
        myMap.put("Dyakovenko", "Denys");
        myMap.put("Brunyarska", "Anna");

//create another hashmap
        Map<String, Integer> sortedMap = new HashMap<>();
        // and fill it: keys - names, values - zeroes. We need this hash map later fo counting number of the same names in main hashmap
        for (Map.Entry entry : myMap.entrySet()) {
            sortedMap.put(String.valueOf(entry.getValue()), 0);
        }

        //count how many the same names in the hashmap
        countFinding(myMap, sortedMap);

        //Remove entries with the same names
        removeDuplicateNames(myMap,sortedMap);


        System.out.println(sortedMap);

        Iterator iterator = myMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static Map<String, String> removeDuplicateNames(Map<String, String> myMap, Map<String, Integer> sortedMap) {
        for (Map.Entry sorted : sortedMap.entrySet()) {
            if ((int) sorted.getValue() > 1) {
                Iterator<Map.Entry<String, String>> iterator = myMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, String> pair = iterator.next();

                    if (pair.getValue().equals(sorted.getKey())) {
                        iterator.remove();
                    }
                }
            }
        }
        return myMap;
    }

    public static Map<String, Integer> countFinding(Map<String, String> myMap, Map<String, Integer> sortedMap) {
        for (Map.Entry entry : myMap.entrySet()) {
            if (sortedMap.containsKey(entry.getValue())) {
                int i = sortedMap.get(entry.getValue());
                i++;
                sortedMap.put(String.valueOf(entry.getValue()), i);
            }
        }
        return sortedMap;
    }

}
