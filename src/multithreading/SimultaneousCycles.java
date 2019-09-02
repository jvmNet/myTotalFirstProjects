package multithreading;

public class SimultaneousCycles {
    private static String messageFirstCycle = null;
    private static long sizeSleepFirstCycle = 0;

    public static void setMessageFirstCycle(String messageFirstCycle) {
        SimultaneousCycles.messageFirstCycle = messageFirstCycle;
    }

    public static void setSizeSleepFirstCycle(long sizeSleepFirstCycle) {
        SimultaneousCycles.sizeSleepFirstCycle = sizeSleepFirstCycle;
    }

    public static String getMessageFirstCycle() {
        return messageFirstCycle;
    }

    public static long getSizeSleepFirstCycle() {
        return sizeSleepFirstCycle;
    }

    public static void main(String[] args) throws InterruptedException {

        SecondCycle secondCycle = new SecondCycle("Cycle - 2", 250);
        Thread threadSecond = new Thread(secondCycle);

        ThreeCycle threeCycle = new ThreeCycle("Cycle - 3", 250);
        Thread threadThree = new Thread(threeCycle);

        threadSecond.start();
        threadThree.start();

        //System.out.println(Thread.activeCount());


        setMessageFirstCycle("Cycle - 1");
        setSizeSleepFirstCycle(250);
        for(int i = 0; i < 10; i++) {
            System.out.println(getMessageFirstCycle());
            try{
                Thread.sleep(getSizeSleepFirstCycle());
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static class SecondCycle implements Runnable {
        private String messageSecondCycle = null;
        private long sizeSleepSecondCycle = 0;

        public SecondCycle(String messageSecondCycle, long sizeSleepSecondCycle) {
            this.messageSecondCycle = messageSecondCycle;
            this.sizeSleepSecondCycle = sizeSleepSecondCycle;
        }

        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                System.out.println(messageSecondCycle);
                try{
                Thread.sleep(sizeSleepSecondCycle);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreeCycle implements Runnable {
        private String messageThreeCycle = null;
        private long sizeSleepThreeCycle = 0;

        public ThreeCycle(String messageThreeCycle, long sizeSleepThreeCycle) {
            this.messageThreeCycle = messageThreeCycle;
            this.sizeSleepThreeCycle = sizeSleepThreeCycle;
        }

        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                System.out.println(messageThreeCycle);
                try{
                    Thread.sleep(sizeSleepThreeCycle);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
