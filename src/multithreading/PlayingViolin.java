package multithreading;

import java.util.Date;

public class PlayingViolin {

    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }

        @Override
        public void run() {

            Date timeBegin = startPlaying();

            PlayingViolin.sleepNSeconds(1);

            Date timeEnd = stopPlaying();

            long timePlaying = timeEnd.getTime() - timeBegin.getTime();
            System.out.println("Playing " + timePlaying + " ms");
        }
    }

}
