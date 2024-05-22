package sixth;

public class CarThread extends Thread {
    final String brand;
    final String model;
    final double price;

    public CarThread(String brand, String model, double price) {
        super();
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("hello my name is " + this.brand);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }

    public static void main(String[] args) {
        CarThread audiThread = new CarThread("Audi", "A4", 3000);
        CarThread bmwThread = new CarThread("BMW", "M3", 5000);
        audiThread.start();
        bmwThread.start();
        System.out.println("cars running");
    }
}
