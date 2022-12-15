package HM_10;

import java.util.ArrayList;


public class Storage<T> {

    ArrayList<T> list = new ArrayList<>();

    public void putElement(T element) {
        list.add(element);
    }

    public void getElement() {
        System.out.println("the last element is: " + list.get(list.size() - 1));
        list.remove(list.size() - 1);
    }
}


