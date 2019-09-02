public class CatWaiting {

    private static final int TIME_SLEEP = 1000;

    private static int seconds = 0;

    public static void main(String[] args) {



    }

    static class Cat implements Runnable {

        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            while(!Thread.currentThread().isInterrupted()) {
                waiting();
            }
            System.out.println("wake up");
        }

        private void waiting() {
            try{
                Thread.sleep(TIME_SLEEP);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
