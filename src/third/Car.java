package third;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        this.engine.start();
    }

    public void stopCar() {
        this.engine.stop();
    }
}
