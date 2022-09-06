package HW_5;

public class Cat5 {
    private static int catCount = 0;

    /*
    create the code that it counts the quantity of created cats
    in the console you should see correct value
    should be "2" here
     */

    public static void main(String[] args) {
        Cat5 cat1 = new Cat5();
        //implement here
        Cat5 cat2 = new Cat5();
        //implement here
        System.out.println("Cats count is: " + Cat5.catCount);
    }

    Cat5() {
        catCount++;
    }
}
