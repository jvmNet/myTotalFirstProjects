package multithreading.runnerStopwatch.controller;

import multithreading.runnerStopwatch.ua.ConsoleView;
import multithreading.runnerStopwatch.ua.IPrint;

public class Stopwatch extends Thread {

    private static volatile boolean isStop = false;

    private final Runner owner;

    private IPrint print;

    private int step = 0;

    public Stopwatch(final Runner owner) {
        this.owner = owner;
        this.print = new ConsoleView();
    }

    public static void setIsStop(boolean isStop) {
        Stopwatch.isStop = isStop;
    }

    @Override
    public void run() {
        try{
            while(!isStop) {
                doStep();
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    private void doStep() throws InterruptedException {
        step++;
        Thread.sleep(1000 / owner.getSpeed());
        print.print(owner.getName() + " do step № " + step);
    }

}
