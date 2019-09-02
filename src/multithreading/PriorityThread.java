package multithreading;

public class PriorityThread {

    private static final long COUNT = 1_000_000_000_000L;

    private static volatile boolean stop = false;

    public static void main(String[] args) {

        final Thread[] threads = new Thread[32];

        for(int i = 0; i < threads.length; i++) {
            final int indexThread = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(long k = 0; k < 1000; k++) {
                        if(stop) {
                            System.out.println(String.format("%d: %d", indexThread, k));
                            break;
                        }
                    }
                }
            });
        }
        for(int i = 0; i < threads.length; i++)
            threads[i].setPriority(i < 16 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY);

        for(int i = 0; i < threads.length; i++)
            threads[i].start();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e ) {
            e.getMessage();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = true;

    }

}
