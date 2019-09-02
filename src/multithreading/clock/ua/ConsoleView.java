package multithreading.clock.ua;

public class ConsoleView implements IPrint {

    @Override
    public void print(String city, int hours, int minutes, int seconds) {

        System.out.println(String.format("time: %s  -  %d:%d:%d ", city, hours, minutes, seconds));

    }
}
