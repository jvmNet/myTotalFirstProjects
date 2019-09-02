package replacerInterfaceExample.readers;

public class Reader implements IReader {
    private final String text;

    public Reader(String text) {
        this.text = text;
    }

    @Override
    public String read() {
        return text;
    }
}
