package HW_6.abstract_classes;

public class Solution2 {
     /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        @Override
        public String getName() {
            String className = String.valueOf(getClass());

            return className.substring(className.lastIndexOf("$")+1);
        }

        @Override
        public Pet getChild() {
            return (new Cat());
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName() {
            String className = String.valueOf(getClass());

            return className.substring(className.lastIndexOf("$")+1);
        }

        @Override
        public Pet getChild() {
            return (new Dog());
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.getName());
        System.out.println(dog.getName());

        cat.getChild();
        dog.getChild();
    }
}
