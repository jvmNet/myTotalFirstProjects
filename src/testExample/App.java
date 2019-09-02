package testExample;

import testExample.printer.ConsolePrinter;
import testExample.printer.IPrinter;
import testExample.printer.PlusPrinter;
import testExample.reader.IReader;
import testExample.reader.Reader;

public class App {

    private final IReader reader;
    private final IPrinter printer;

    public App(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public static void main(String[] args) {
        App app = new App(new Reader("Hello=) good=) tools=)"), new ConsolePrinter());
        App appPlus = new App(new Reader("Hello=) good=) tools=)"), new PlusPrinter());

        app.replace();
        appPlus.replace();

    }

    public void replace() {
        final String message = reader.read();
        final String replaceText = message.replace("=)", ":)");
        printer.print(replaceText);
    }
}
