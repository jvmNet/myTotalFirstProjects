package multithreading;

public class SeriesThread {

    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread()
                    .join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            try{
                while (true) {
                    System.out.println(this);
                    if (--countDownIndex == 0)
                        return;
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("Нить прервана");
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }

}
