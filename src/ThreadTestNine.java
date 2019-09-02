public class ThreadTestNine {

    private static int a = 0;

    public static void main(String[] args) {

        Test test = new Test("thread");

        Thread t = new Thread(test);
        t.start();

    }

    public static class Test extends Thread {

        private final String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public synchronized void start() {

        }

        @Override
        public void run() {
           while(true) {
                initNumber();
                waiting();
                System.out.println(a);
           }
        }

        private void initNumber() {
            a++;
        }

        private void waiting() {
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }


}
