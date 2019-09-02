package objectStructure;

import java.util.ArrayList;
import java.util.List;

public class CreateMassObject {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for(Object mass: apartments) {
            if(mass instanceof Apt1Room)
                ((Apt1Room) mass).clean1Room();

            if(mass instanceof Apt2Room)
                ((Apt2Room) mass).clean2Rooms();

            if(mass instanceof Apt3Room)
                ((Apt3Room) mass).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
