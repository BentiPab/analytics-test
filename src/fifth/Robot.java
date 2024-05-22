package fifth;

public class Robot {

    public void move() {
        Thread horizontalThread = new HorizontalThread();
        Thread verticalThread = new VerticalThread();

        horizontalThread.start();
        verticalThread.start();
    }
}
