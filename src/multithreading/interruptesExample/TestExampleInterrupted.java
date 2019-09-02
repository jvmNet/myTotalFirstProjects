package multithreading.interruptesExample;

public class TestExampleInterrupted {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Cat());
        t.start();
        Thread.sleep(5000);
        t.interrupt();
        t.join();

    }

    static class Cat implements Runnable {

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("sleep begin");
                sleep();
                System.out.println("sleep end");
            }
            System.out.println("end thread");
        }

        private void sleep() {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("sleep close");
                Thread.currentThread().interrupt();
            }
        }
    }
}
