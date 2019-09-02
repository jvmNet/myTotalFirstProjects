package testExample.reader;

public class Reader implements IReader {

    private final String message;

    public Reader(String message) {
        this.message = message;
    }

    @Override
    public String read() {
        return this.message;
    }
}
