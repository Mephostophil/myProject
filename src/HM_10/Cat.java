package HM_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cat implements Comparable<Cat> {

    String name;
    Integer age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat vaska = new Cat("Vaska", 5);
        Cat murka = new Cat("Murka", 10);
        Cat pooh = new Cat("Pooh", 2);

        cats.add(vaska);
        cats.add(murka);
        cats.add(pooh);

        System.out.println("Sorting by name ascending:");
        Collections.sort(cats);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("///////////////////////////////////////////");


        System.out.println("Sorting by age ascending:");
        Collections.sort(cats, new ComparatorAgeAscending());
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("///////////////////////////////////////////");

        System.out.println("Sorting by age descending:");
        Collections.sort(cats, new ComparatorAgeDescending());
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("///////////////////////////////////////////");

        System.out.println("Sorting by name ascending:");
        Collections.sort(cats, new ComparatorNameDescending());
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }


}
