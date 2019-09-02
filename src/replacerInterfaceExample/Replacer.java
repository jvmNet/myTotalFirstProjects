package replacerInterfaceExample;

import replacerInterfaceExample.printers.IPrinter;
import replacerInterfaceExample.readers.IReader;

public class Replacer {
    private final IReader reader;
    private final IPrinter printer;

    public Replacer(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace() {
        String text = reader.read();
        String replaceText = text.replace("=)", ":)");
        printer.printer(replaceText);
    }
}
