package objectStructure.createObjectWithInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while(isKey(key = reader.readLine())) {

            if(key.equals("user")) {
                person = new User();
                doWork(person);
            }

            if(key.equals("loser")) {
                person = new Loser();
                doWork(person);
            }

            if(key.equals("coder")) {
                person = new Coder();
                doWork(person);
            }

            if(key.equals("proger")) {
                person = new Proger();
                doWork(person);
            }
        }
    }

    public static void doWork(Person person) {
        if(person instanceof User) ((User) person).live();
        if(person instanceof Loser) ((Loser) person).doNothing();
        if(person instanceof Coder) ((Coder) person).coding();
        if(person instanceof Proger) ((Proger) person).enjoy();
    }

    public static boolean isKey(String key) {
        final String[] keyMass = {"user", "loser", "coder", "proger"};
        boolean check = false;

        for(int i = 0; i < keyMass.length; i++) {
            if(key.equals(keyMass[i])) check = true;
        }
        return check;
    }
}
