package thinkingJava.part5;

class Tree {
    int height;

    Tree() {
        height = 5;
        System.out.println("Planting and Seedling");
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feel tall");
    }
}

public class Overloading {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }

        new Tree();
    }
}
