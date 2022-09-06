package HW_5;

public class Cat6 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    /*
    Create 5 constructors
    1. Name
    2. Name, weight, age
    3. Name, age. (weight should be standard)
    4. weight, color. (name, address and age are unknown. Cat is homeless)
    5. weight, color, address

    Each constructor should create the valid object.
    For example, if we don't know weight, we should specify some kind of standard weight.
    Because cat cannot weight anything
    The same with age
    But it cannot have name(null) and address(null)
     */

    // 1. Name
    Cat6(String name) {
        this.name = name;
    }

    //2. Name, weight, age
    Cat6(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //3. Name, age. (weight should be standard)
    Cat6(String name, int age) {
        this.name = name;
        this.weight = 2;
        this.age = age;
    }

    //4. weight, color. (name, address and age are unknown. Cat is homeless)
    Cat6(int weight, String color) {
        this.name = null;
        this.address = null;
        this.age = 0;

        this.weight = weight;
        this.color = color;
    }

    //5. weight, color, address
    Cat6(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}

