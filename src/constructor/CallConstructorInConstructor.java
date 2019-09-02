package constructor;

public class CallConstructorInConstructor {
    public double x;
    public double y;
    public double radius;

    public CallConstructorInConstructor(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public CallConstructorInConstructor(double x, double y) {
        //напишите тут ваш код
        this(x,y,10);
    }

    public CallConstructorInConstructor() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        CallConstructorInConstructor circle = new CallConstructorInConstructor();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        CallConstructorInConstructor anotherCircle = new CallConstructorInConstructor(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
