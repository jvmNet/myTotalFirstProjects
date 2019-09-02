package thinkingJava.part5;

class Apple {
    String nameApple = "Apple name";
}

public class CallingConstructorWithThis {
    int petalCount = 0;
    String s = "initial value";

    public CallingConstructorWithThis(String s) {
        this.s = s;
    }

    public CallingConstructorWithThis(Apple apple) {
        System.out.println(apple.nameApple);
    }

    public CallingConstructorWithThis(int petalCount) {
        this.petalCount = petalCount;
    }

    public CallingConstructorWithThis(int petalCount, String s) {
        this.petalCount = petalCount;
        this.s = s;
    }

    public CallingConstructorWithThis(String s, int petalCount) {
        this.s = s;
        this.petalCount = petalCount;
    }

    public CallingConstructorWithThis() {
        this("Hello!", 17);
    }

    public void print() {
        System.out.println(petalCount + " " + s);
    }

    public static void main(String[] args) {
        new CallingConstructorWithThis(new Apple());

    }
}
