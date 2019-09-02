package multithreading.timeEnterText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(IN);

        Cat cat = new Cat("Pen");
        cat.start();

        System.out.println("Cat waiting...");
        String root = reader.readLine();

        cat.interrupt();

        System.out.println(cat);

    }

    static class Cat extends Thread {

        private final String name;

        private int seconds;

        public Cat(String name) {
            super(name);
            this.name = name;
        }

        public String getNameCat() {
            return name;
        }

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) {
                seconds++;
                catWaiting();
            }
        }

        private void catWaiting() {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        @Override
        public String toString() {
            return String.format("%s waiting %d seconds.", this.name, this.seconds);
        }
    }

}
