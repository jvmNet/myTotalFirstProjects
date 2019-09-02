import java.util.ArrayList;
import java.util.List;

public class AppFilterPerson {

    public static final String LINE = "-";
    public static final int SIZE_LINE = 15;

    public static void main(String[] args) {

        List<Person> personList = getListPerson();

        personList.stream()
                .filter(person -> person.getId() == 55)
                .map(person -> "id: " + person.getId() + " name: " + person.getName())
                .forEach(person -> System.out.println(person));

        showLine();

        personList.stream()
                .filter(person -> person.getName().equals("Ivan"))
                .map(person -> "id: " + person.getId() + " name: " + person.getName())
                .forEach(person -> System.out.println(person));

        showLine();

        personList.stream()
                .filter(person -> person.getId() != 55 && !person.getName().equals("Ivan"))
                .map(person -> "id: " + person.getId() + " name: " + person.getName())
                .forEach(person -> System.out.println(person));

        showLine();



    }

    private static void showLine() {
        for (int i=0; i<SIZE_LINE; i++)
            System.out.print(LINE);
        System.out.println();
    }

    private static List<Person> getListPerson() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Ivan", 37));
        list.add(new Person("Petro", 31));
        list.add(new Person("Ira", 55));
        list.add(new Person("Roma", 25));
        list.add(new Person("Zoro", 39));

        return list;

    }

    static class Person {

        private final String name;

        private final int id;

        public Person(final String name, final int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.valueOf(getId());
        }
    }
}

