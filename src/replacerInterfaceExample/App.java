package replacerInterfaceExample;

import replacerInterfaceExample.printers.ConsolePrinter;
import replacerInterfaceExample.printers.IPrinter;
import replacerInterfaceExample.readers.IReader;
import replacerInterfaceExample.readers.Reader;

public class App {
    private static IReader reader;
    private static IPrinter printer;
    private static Replacer replacer;

    public static void main(String[] args) {
        final String text = "Hello=) good=) nod=)";

        reader = new Reader(text);
        printer = new ConsolePrinter();

        replacer = new Replacer(reader, printer);
        replacer.replace();
    }
}
