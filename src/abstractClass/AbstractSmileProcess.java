package abstractClass;

public abstract class AbstractSmileProcess {

    public void process() {
        final String text = this.read();
        final String replaceText = text.replace("=)", ":)");
        this.print(replaceText);
    }

    protected abstract String read();
    protected abstract void print(final String message);

}
