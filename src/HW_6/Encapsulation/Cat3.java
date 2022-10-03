package HW_6.Encapsulation;

public class Cat3 {
    /*
    Close access to all internal variables
    and methods that allow changing internal state objects of class Cat.
    */

    private String name;
    private int age;
    int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}