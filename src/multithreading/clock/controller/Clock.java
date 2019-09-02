package multithreading.clock.controller;

import multithreading.clock.ua.ConsoleView;
import multithreading.clock.ua.IPrint;

public class Clock extends Thread {

    public static volatile boolean isStopTime = false;

    private IPrint print;

    private final String city;

    private int hours;

    private int minutes;

    private int seconds;

    public Clock(final String city, final int hours, final int minutes, final int seconds) {
        this.city = city;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        print = new ConsoleView();
    }

    public static void isStopTime() {
        Clock.isStopTime = true;
    }

    @Override
    public void run() {

        while(!isInterrupted())
            showTime();

    }

    public static void sizeTime(long time) {
        try{

            Thread.sleep(time);
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void showTime() {
        try{

            Thread.sleep(1000);
            this.seconds++;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sizeSecond(seconds);
        sizeMinute(minutes);
        sizeHour(hours);

        print.print(this.city, this.hours, this.minutes, this.seconds);

    }

    private void sizeSecond(final int second) {
        if(second%60 == 0) {
            this.seconds = 0;
            this.minutes+= 1;
        }
    }

    private void sizeMinute(final int minute) {
        if(minute%60 == 0 && minute != 0) {
            this.minutes = 0;
            this.hours+= 1;
        }
    }

    private void sizeHour(final int hour) {
        if(hour%24 == 0) {
            this.hours = 0;
        }
    }

}
