package mass;

import java.util.HashSet;
import java.util.Set;

public class RemoveSetAllCollection {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код

        for(int i = 0; i < 4; i++){
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код

        Set<Dog> result = new HashSet<Dog>();

        for(int i = 0; i < 3; i++){
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код

        Set<Object> all = new HashSet<Object>();

        all.addAll(cats);
        all.addAll(dogs);

        return all;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object mass: pets) System.out.println(mass);
    }

    //напишите тут ваш код
    public static class Cat{

    }

    public static class Dog{

    }
}
