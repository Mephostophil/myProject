package HW_6.Encapsulation;

public class Cat1 {
    //Close access to all internal variables of the class
    private String name;
    private int age;
    private int weight;
    private String color;

    public int getAge(){
        return age;
    }

    public String getColor(){
     return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
