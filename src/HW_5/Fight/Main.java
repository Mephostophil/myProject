package HW_5.Fight;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Marseak", 5, 5);
        System.out.println(cat1.getName());
        System.out.println(cat1.getStrength());
        Cat cat2 = new Cat("Borys", 10, 2);
        Cat cat3 = new Cat("Pooh", 3, 4);
        System.out.println(cat2.getStrength());

        fightStart(cat1, cat2, cat1.fight(cat2));
        fightStart(cat2, cat1, cat2.fight(cat1));

        fightStart(cat1, cat3, cat1.fight(cat3));
        fightStart(cat3, cat1, cat3.fight(cat1));

        fightStart(cat2, cat3, cat2.fight(cat3));
        fightStart(cat3, cat2, cat3.fight(cat2));

    }

    public static void fightStart(Cat firstCat, Cat secondCat, boolean result) {
        System.out.println(firstCat.getName() + " against " + secondCat.getName() + "...fight!");
        if (firstCat.fight(secondCat)) {
            System.out.println(firstCat.getName() + " won! Applause!!");
        }
        else System.out.println(secondCat.getName() + " won! Applause!!");
        System.out.println();
    }
}
