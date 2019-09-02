
class Cat {
    public Cat parent;

    public Cat getMyParent() {
        return this.parent;
    }

    public void setMyParent(Cat cat) {
        this.parent = cat;
    }
}

class Tiger extends Cat {
    public Tiger getMyParent() {
        return (Tiger) this.parent;
    }
}

public class TestExample {
    private int i = 5;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) throws  Exception{

        Cat parent = new Cat();

        Cat me = new Cat();
        me.setMyParent(parent);

        Cat myParent = me.getMyParent();


    }

    public void test() throws NullPointerException {

        setI(55);

        System.out.println(getI());

        String s = null;

        int x = 5;
        Object o = x;

        if(o instanceof Float) {
            System.out.println("Float");
        } else if (o instanceof Integer) {
            System.out.println("Integer");
        } else if(o instanceof Character) {
            System.out.println("Character");
        } else if (o instanceof String) {
            System.out.println("String");
        }


        double a = 1e+5;

        System.out.println(a);



        try{
        Class.forName("TestExample");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


















    }
}
