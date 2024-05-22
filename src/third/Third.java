package third;

public class Third {
    public static void main(String[] args) {
        //DEPDENENCY INJECTION EXAMPLE
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
        car.stopCar();


        // SINGLETON EXAMPLE
        Logger.getInstance().log("SINGLETON");
    }
}
