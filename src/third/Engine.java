package third;

public class Engine {
    private boolean started;

    public boolean isStarted() {
        return started;
    }

    public void start() {
        this.started = true;
        Logger.getInstance().log("Engine started");
    }

    public void stop() {
        this.started =false;
        Logger.getInstance().log("Engine stopped");
    }

}
