package fifth;

public class HorizontalThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (Math.random() > 0.5) {
                System.out.println("Moving left...");
            } else {
                System.out.println("Moving right...");
            }
        try {
            long sleepTime = Math.round(Math.random() * 10000);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }
}
