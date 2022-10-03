package HM_8.Object_methods;

import java.util.Objects;

public class Cat {
    /*
    Override methods equals() and hashCode() that it took @name and @age
    Create several object with the same names and ages and different and print the result of comparing
    Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
     */

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Catname: " + name  +
                ", age: " + age  +
                ", weight: " + weight;
    }

    public static void main(String[] args) {
        Cat Marseak1 = new Cat("Marseak", 1, 3);
        Cat Marseak2 = new Cat("Marseak", 1, 1);
        Cat Marseak3 = new Cat("Marseak", 2, 2);
        Cat Pooh1 = new Cat("Pooh", 2, 4);
        Cat Pooh2 = new Cat("Pooh", 1, 6);
        Cat Pooh3 = new Cat("Pooh", 3, 7);
        Cat Beangls1 = new Cat("Beangls", 5, 4);
        Cat Beangls2 = new Cat("Beangls", 3, 4);
        Cat Beangls3 = new Cat("Beangls", 2, 4);

        System.out.println(Marseak3.equals(Marseak2));
        System.out.println(Marseak1.equals(Marseak2));
        System.out.println(Pooh1.equals(Marseak1));
        System.out.println(Beangls2.equals(Pooh3));
        System.out.println(Marseak3.equals(Beangls1));

        System.out.println(Marseak3);
    }
}
