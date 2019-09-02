package replacerInterfaceExample.printers;

public class ConsolePrinter implements IPrinter {

    @Override
    public void printer(String message) {
        System.out.println(message);
    }
}
