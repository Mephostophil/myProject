package HW_6.Polymorphism;

    /* "Cow" or "Whale" or "Dog" or "Unknown animal"
    Implement method, that defines, the type of object which class was passed,
    And return the result – one of the strings: "Cow", "Whale", "Dog", "Unknown animal".
    */

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Implement here
        String className = String.valueOf(o.getClass());
        if ((o instanceof Cow)||(o instanceof Whale)||(o instanceof Dog))
        {
            return String.valueOf(className.substring(className.lastIndexOf("$")+1));
        }
        else return "Unknown animal";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
