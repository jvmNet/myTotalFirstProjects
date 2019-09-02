import exception.UncaughtThreadException;

public class UncaughtExceptionExample {

    private static Thread.UncaughtExceptionHandler handler = new OurUncaughtException();

    public static void main(String[] args) {

        Dog dog = new Dog("Bax");

        dog.start();

        dog.interrupt();

    }

    public static class Dog extends Thread {

        private final String name;

        public Dog(String name) {
            super(name);
            setDefaultUncaughtExceptionHandler(handler);
            this.name = name;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException("dog");
            }
        }
    }

    private static class OurUncaughtException implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }

}
