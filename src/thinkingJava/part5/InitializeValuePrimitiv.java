package thinkingJava.part5;

public class InitializeValuePrimitiv {

    int i = 0;

    public int getI() {
        return i;
    }

    int f() {
        return 15;
    }

    public static void main(String[] args) {

        InitializeValuePrimitiv initializeValuePrimitiv = new InitializeValuePrimitiv();

        initializeValuePrimitiv.i = initializeValuePrimitiv.f();
        System.out.println(initializeValuePrimitiv.getI());

    }

}
