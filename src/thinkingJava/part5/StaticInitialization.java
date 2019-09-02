package thinkingJava.part5;

class Bowl {
    Bowl(int marcker) {
        System.out.println("Bowl (" + marcker + ")");
    }

    void f1(int marcker) {
        System.out.println("Bowl (" + marcker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marcker) {
        System.out.println("f2(" + marcker + ")");
    }
}

class Cupboard {
    //this
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

}

public class StaticInitialization {
        private static Table table = new Table();
        private static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();

        table.f2(1);
        cupboard.f3(1);

    }
}
