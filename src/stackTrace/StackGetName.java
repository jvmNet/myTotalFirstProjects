package stackTrace;

public class StackGetName {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method2();
        return stackTraceElements[0].getMethodName();
    }

    public static String method2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method3();
        return stackTraceElements[0].getMethodName();
    }

    public static String method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method4();
        return stackTraceElements[0].getMethodName();
    }

    public static String method4() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method5();
        return stackTraceElements[0].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) System.out.println(element.getMethodName());
        return stackTraceElements[0].getMethodName();
    }
}
