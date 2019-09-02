package stackTrace;

import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

public class StackTrace {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) System.out.println("Name class: " + element.getClassName() + " Name method: " + element.getMethodName() + " Name File: " + element.getFileName());

        return Thread.currentThread().getStackTrace();
    }
}
