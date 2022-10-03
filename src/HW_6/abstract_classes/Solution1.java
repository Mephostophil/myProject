package HW_6.abstract_classes;

public class Solution1 {
      /*
    Extend class Cow from animal
    implement all the necessary methods
     */

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{
        @Override
        public String getName() {
            String name;
            return String.valueOf(getClass());
        }
    }
   public static void main(String[] args) {
        System.out.println(Animal.class.getName());
        Animal cow = new Cow();
        System.out.println(cow.getClass().getSimpleName());
   }
}
