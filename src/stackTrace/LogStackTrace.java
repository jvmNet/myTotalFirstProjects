package stackTrace;

public class LogStackTrace {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.print(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + s);

    }
}
