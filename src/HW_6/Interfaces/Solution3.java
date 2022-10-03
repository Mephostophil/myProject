package HW_6.Interfaces;

public class Solution3 {
       /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public class Dog implements Move, Eat {

        public void move() {}

        public void eat() {}
    }

    public class Car implements Move {

        public void move() {}
    }

    public class Duck implements Fly, Move, Eat {

        public void fly() {}

        public void move() {}

        public void eat() {}
    }

    public class Airplane implements Fly, Move{

        public void fly() {}

        public void move() {}
    }
}
