package HW_5.Fight;

public class Cat {

    private double strength;
    private String name;
    private int age;
    private int weight;

    public static void main(String[] args) {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = "name";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getStrength() {
        return strength;
    }

    boolean fight(Cat anotherCat) {
        if (this.strength >= anotherCat.strength) {
            return true;
        } else return false;
    }

    public void fightStart(Cat firstCat, Cat secondCat, boolean result) {
        System.out.println(firstCat.getName() + " against " + secondCat.getName() + "...fight!");
        if (firstCat.fight(secondCat)) {
            System.out.println(firstCat.getName() + " won! Applause!!");
        }
        else System.out.println(secondCat.getName() + " won! Applause!!");
        System.out.println();
    }

    double strengthCalculate(int weight, int age) {
        double yearCoefficient = 0;
        if ((age > 2) && (age < 11)) {
            yearCoefficient = age;
        } else {
            yearCoefficient = age * 0.8;
        }

        return weight * yearCoefficient;
    }

    Cat(String name, int weight, int age) {
        this.weight = weight;
        this.age = age;
        this.strength = strengthCalculate(weight, age);
        this.name = name;
    }

/*        2.2. Implement the method with the logic of fighting the cats
    that depends on weight, age and strength.
    The method should calculate the result of fighting, did we win(this)
    and if yes - return true, if no - return false
    Should calculate next condition:
            if cat1.fight(cat2) == true -> cat2.fight(cat1) == false
            3. Create 3 object of Cat
    3.1. In the method main create 3 object of type Cat, fill them with data
4. Create 3 rounds of fight in pairs between the cats.
            5. The result of each fight print to the console*/
}
