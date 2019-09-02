package multithreading;

public class UpDownIteratorThread {

    public static int number = 5;

    public static void main(String[] args) {

        new Thread(new CountDownRunnable(), "Уменьшаем")
                .start();

        new Thread(new CountUpRunnable(), "Увеличиваем")
                .start();

    }

    public static class CountUpRunnable implements Runnable {

        private volatile int countDown = 0;

        @Override
        public void run() {

            try{
                while(countDown < number) {
                    countDown++;
                    System.out.println(toString());
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }

        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + this.countDown;
        }
    }

    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = UpDownIteratorThread.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0)
                        return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

}
