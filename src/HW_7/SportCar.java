package HW_7;

public class SportCar extends Car{
    public SportCar(SportEngine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.println("SportCar engine: ");
        //implement here
        engine.setEngine();

    }
}
