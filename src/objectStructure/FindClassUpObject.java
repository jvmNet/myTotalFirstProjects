package objectStructure;

interface HasBatteries {}
interface Waterprof {}
interface Shoots {}

class Toy {
    Toy() {}
    Toy (int i) {}

    public void printToy(){
        System.out.println("objectStructure.Toy method");
    }
}

public class FindClassUpObject extends Toy
implements HasBatteries, Waterprof, Shoots {

    FindClassUpObject() {
        super(1);
    }

}

class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса: " + cc.getName() + " это интерфейс?[" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try{
            c = Class.forName("objectStructure.FindClassUpObject");
        } catch (ClassNotFoundException e) {
            System.out.println("не найден класс FancyToy");
            System.exit(1);
        }

        printInfo(c);

        for(Class face: c.getInterfaces()) {
            System.out.println(face);
        }

        Class up = c.getSuperclass();
        System.out.println(up);

        Object obj = null;

        try{
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("He удалось создать объект");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }

}
