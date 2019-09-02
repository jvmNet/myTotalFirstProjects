package testExample.printer;

public class PlusPrinter implements IPrinter {
    @Override
    public void print(String message) {
        System.out.println("Plus " + message);
    }
}
