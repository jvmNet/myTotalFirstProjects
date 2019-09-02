package nestedInner;

public class NestedClass {
    private final Status status;
    private final String name;
    private final int age;

    public NestedClass(Status status, String name, int age) {
        this.status = status;
        this.name = name;
        this.age = age;
    }

    public enum Status {
        HAPPY,
        NON_HAPPY,
        BOOM,
        ZOOM,
        NOOK;
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass(Status.HAPPY, "Ivan", 35);

        System.out.println(nestedClass.toString());
    }

    @Override
    public String toString() {
        return "Status: " + status + " Name: " + name + " Age: " + age;
    }
}
