package HM_10;

import java.util.ArrayList;
import java.util.Comparator;


public class ComparatorNameDescending implements Comparator<Cat> {
        /*
    1. Create class Cat with fields name and age
    3. Implement method toString()
    2. Implement Comparable interface for the Cat class, which compare cats by names
    3. Create Collections with several cats, and check with the method sort() that it sorts by name
    4. Create ...Comparator... class which implements interface Comparator and can sort cats by name descending
    5. Create ...Comparator... class which implements interface Comparator and can sort cats by age ascending
    6. Create ...Comparator... class which implements interface Comparator and can sort cats by age descending
    7. Demonstrate how they work on main method
    P.S. All the Classes should be in the different files
     */
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return (cat1.getName().compareTo(cat2.getName())) * (-1);
    }
}
