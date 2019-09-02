package thinkingJava.part5;

class Person {
    void eat(Fruit.Apple apple, Fruit.Banana banana, Fruit.Cherry cherry) {
        Fruit.Apple peelApple = apple.getPeelApple();
        Fruit.Banana peelBanana = banana.getPeelBanana();
        Fruit.Cherry peelCherry = cherry.getPeelCherry();


        System.out.println("Yummi: " + peelApple.getName() + " " + peelBanana.getName() + " " + peelCherry.getName());
    }

    void eat(Fruit.Apple apple, Fruit.Banana banana) {
        Fruit.Apple peelApple = apple.getPeelApple();
        Fruit.Banana peelBanana = banana.getPeelBanana();

        System.out.println("Yummi: " + peelApple.getName() + " " + peelBanana.getName());
    }

    void eat(Fruit.Apple apple) {
        Fruit.Apple peelApple = apple.getPeelApple();

        System.out.println("Yummi: " + peelApple.getName());
    }
}

class Fruit {
    String nameFruit = null;

    class Apple {
        private String name = "Apple";

        public String getName() {
            return name;
        }

        Fruit.Apple getPeelApple() {
            return Peller.peel(this);
        }
    }

    class Banana {
        private String name = "Banana";

        public String getName() {
            return name;
        }

        Fruit.Banana getPeelBanana() {
            return Peller.peel(this);
        }
    }

    class Cherry {
        private String name = "Cherry";

        public String getName() {
            return name;
        }

        Fruit.Cherry getPeelCherry() {
            return Peller.peel(this);
        }
    }

}

class Peller {
    static Fruit.Apple peel(Fruit.Apple apple) {
        return apple;
    }
    static Fruit.Banana peel(Fruit.Banana banana) {
        return banana;
    }
    static Fruit.Cherry peel(Fruit.Cherry cherry) {
        return cherry;
    }
}


public class InitializationPasingThis {
    public static void main(String[] args) {

        new Person().eat(new Fruit().new Apple());
        new Person().eat(new Fruit().new Apple(), new Fruit().new Banana());
        new Person().eat(new Fruit().new Apple(), new Fruit().new Banana(), new Fruit().new Cherry());

    }
}
