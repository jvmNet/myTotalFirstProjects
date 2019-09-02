package multithreading.clock;

import multithreading.clock.controller.Clock;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Clock kropivnitskii = new Clock("Kropivnitskii", 23, 03, 59);

        Thread t = new Thread(kropivnitskii);
        t.start();

        Thread.sleep(3000);

        t.isInterrupted();
    }

}
