package thinkingJava.part5;

class Cup {
    Cup(int marcker) {
        System.out.println("Cup (" + marcker + ")");
    }

    void f(int marcker) {
        System.out.println("f (" + marcker + ")");
    }
}

class Cups {
    static Cup cup1 = null;
    static Cup cup2 = null;

    static {
        //cup1 = new Cup(1);
        cup2 = new Cup(2);
    }


    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");

        try{

             Cups.cup1.f(99);

        } catch (NullPointerException e) {
            System.out.println("null - reference");
        }

        // static Cups cups1 = new Cups();  // (2)
        // static Cups cups2 = new Cups();  // (2)

    }
}
