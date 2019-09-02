package multithreading;

public class Start321 {

    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {

        Racing racing = new Racing();

        Thread.sleep(3500);

        racing.interrupt();

        int x = 10;
        double y = 0.7;

        System.out.println((int) (x * y));
    }

    public static class Racing extends Thread {

        public Racing() {
            start();
        }

        @Override
        public void run() {

            try{

                while(1 <= countSeconds) {

                    System.out.print(countSeconds + " ");
                    countSeconds--;
                    Thread.sleep(1000);

                }

            } catch (InterruptedException e) {
                System.out.print("Прервано!");
                return;
            }
            System.out.print("Марш!");
        }
    }

}
