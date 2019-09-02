package stackTrace;

public class StackTraceMass {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        method5();
    }

    public static void method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();


        for(StackTraceElement mass: stackTraceElements) System.out.println(mass.getMethodName());
    }
}
