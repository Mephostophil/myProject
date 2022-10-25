package HM_9;

import java.util.HashMap;

public class Solution8 {
    /*
    1. Create the class Cat with variable name
    2. Create HashMap<String, Cat>
    3. Add to the map 10 cats, as a key, use the name of the Cat
    4. Print to the console each element from new line
     */


    public static void main(String[] args) {

        HashMap<String, Cat> myHashMap = new HashMap();

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("Cat # " + i);
            myHashMap.put(cat.getName(), cat);
        }

        for(HashMap.Entry<String, Cat> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());


    }


}
