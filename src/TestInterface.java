
interface IHuman {
    void eat();
    void move();
    void sleep();
    void say();
}

interface ISwiming {
    void swim();
    void dive();
    void save();
}

class Human implements IHuman {

    @Override
    public void eat() {

    }

    @Override
    public void move() {
        System.out.println("Human: move");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void say() {

    }
}

class SaveHuman implements IHuman, ISwiming {

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void say() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void dive() {
        System.out.println("SaveHuman: dive");
    }

    @Override
    public void save() {

    }
}

public class TestInterface {
    public static void main(String[] args) {

        ISwiming saveHuman = new SaveHuman();
        saveHuman.dive();

        IHuman human = new Human();
        human.move();

    }

}
