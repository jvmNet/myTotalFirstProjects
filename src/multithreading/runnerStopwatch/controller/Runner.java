package multithreading.runnerStopwatch.controller;

public class Runner {

    private Stopwatch stopwatch;

    private final String name;

    private final int speed;

    public Runner(final String name, final int speed) {
        this.name = name;
        this.speed = speed;
        this.stopwatch = new Stopwatch(this);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        stopwatch.start();
    }

    public void runs(long time) {
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

}
