
class Person {
    void eat(Fruit apple, Fruit cherry, Fruit banan) {
        Fruit applePeel = apple.getApple();
        Fruit cherryPeel = cherry.getCherry();
        Fruit bananPeel = banan.getBanan();

        System.out.println("Yummy: " + applePeel.nameFruit + applePeel.peel  + " " + cherryPeel.nameFruit +
                " " + bananPeel.nameFruit);
    }
}

class Fruit {
    int a = 0;

    String peel = null;
    String nameFruit = null;

    Fruit apple = null;
    Fruit cherry = null;
    Fruit banan = null;

    public Fruit(String peel, int a) {
        this.peel = peel;
        this.a = a;
    }

    public Fruit() {
        this("Fruit_t", 15);
    }

    public Fruit getApple() {
        nameFruit = "Apple";
        peel = "jhgjhg";
        return this;
    }

    public Fruit getCherry() {
        nameFruit = "Cherry";
        return Peller.peel(this);
    }

    public Fruit getBanan() {
        nameFruit = "Banan";
        return Peller.peel(this);
    }
}

class Peller {
    String peelProcces = null;

    static Fruit peel(Fruit fruit) {
        fruit.peel = "peel";
        return fruit;
    }

}

public class TestMain {
    public static void main(String[] args) {
      //  new Person().eat(new Fruit().getApple(), new Fruit().getCherry(), new Fruit().getBanan());

        Fruit fruit = new Fruit();

        System.out.println(fruit.peel + " " + fruit.a);

    }

}
