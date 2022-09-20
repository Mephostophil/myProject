package HW_7;

public class Main {
        /*
    Implement one row of code in SportCar class and TaxiCar class
    That it prints to the console:
    SportCar engine:
    Sport
    TaxiCar engine:
    Taxi
     */

    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car taxiCar = new TaxiCar(new TaxiEngine());
        taxiCar.setEngine();
    }
}
