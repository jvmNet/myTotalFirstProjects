package abstractClass;

public class SmileProcess extends AbstractSmileProcess {

    private final String message;

    public SmileProcess(String message) {
        this.message = message;
    }

    @Override
    protected String read() {
        return message;
    }

    @Override
    protected void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        SmileProcess smileProcess = new SmileProcess("Hello=)");
        smileProcess.process();

    }

}
