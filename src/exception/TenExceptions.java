package exception;

import java.util.ArrayList;
import java.util.List;

public class TenExceptions {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] a = new int[1];
            a[5] = 1;

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String a = "Hi";
            Integer.parseInt(a);

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            String text = "hello";
            text.substring(0, 15);

        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] mass = new int[-2];

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            String text = null;
            text.length();

        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> mass = new ArrayList<>();
            mass.remove(5);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            stackTraceElements.notifyAll();
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        }

        try{
            Thread thread = Thread.currentThread();
            thread.start();
        } catch (IllegalThreadStateException e) {
            exceptions.add(e);
        }

        try{

            Object[] mass = new Integer[3];
            mass[1] = new Character('*');

        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
    }
}
