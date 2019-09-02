
public class ExampleTEST {

    static int x = 0;

    static int y = 0;

    public int sum(int a, int b) {
        return a + b;
    }

    public void example() {
        int a = 15;
        int b = 15;

        this.sum(a, b);

        System.out.println(this.toString());

        a = sum(a, b);
        System.out.println(a);

        b = this.sum(this.sum(a, b), b);
        System.out.println(b);
    }

    public static void main(String[] args) {

        //new ExampleTEST().example();
        System.out.println("one line");
        System.out.println("two line");
        System.out.println("three line");

        System.out.println();


        for(int i = 0; i < 5; i++)
            incrementTest();

        System.out.println(y);
        new ExampleTEST().example();

        if(new ExampleTEST().sum(5, 5) == 10)
            return;

        System.out.println("four line");

    }

    private static void incrementTest() {
        y = x++;
    }

    @Override
    public String toString() {
        return "sum";
    }
}
