package thinkingJava.part5;

class Banana {
        void peel(int i) {
            System.out.println(i);
        }
}

class Leaf {
    int i = 0;
    int y = 5;
    Leaf incrementI() {

        y+= y;
        return this;
    }


    void print() {
        System.out.println(y);
    }
}

public class KeyWordThis {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.incrementI().print();
        leaf.incrementI().incrementI().print();
    }
}
