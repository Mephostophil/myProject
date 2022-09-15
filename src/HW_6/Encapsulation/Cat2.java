package HW_6.Encapsulation;

public class Cat2 {
    /*
    Close access to all internal variables
    but only for which we can get access through the methods
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}