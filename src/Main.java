


import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static volatile AtomicInteger NUMBER = new AtomicInteger(0);

    public AtomicInteger getNUMBER() {
        return NUMBER;
    }

    public static void main(String[] args) throws InterruptedException {



    }

    public static class Cat implements Runnable {

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) {
                sleep();
            }
        }

        private void sleep() {
            try{
                NUMBER.incrementAndGet();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
