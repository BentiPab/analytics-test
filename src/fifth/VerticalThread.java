package fifth;

public class VerticalThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (Math.random() > 0.5) {
                System.out.println("Moving down...");
            } else {
                System.out.println("Moving up...");
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
