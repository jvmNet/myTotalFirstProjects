package multithreading;

public class TestExample {

    public static void main(String[] args) {

        Print print = new Print("Ira");
        Thread thread = null;

        for(int i = 0; i < 100; i++) {
            thread = new Thread(print);
            thread.start();
        }

    }

}

class Print implements Runnable {

    private final String name;

    public Print(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }
}
