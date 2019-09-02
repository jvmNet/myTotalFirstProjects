package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstructorTOStringCat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = reader.readLine();
        Cat granddadCat = new Cat(granddadName);

        String grandmotherName = reader.readLine();
        Cat grandmotherCat = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat fatherCat = new Cat(fatherName, null, granddadCat);

        String motherName = reader.readLine();
        Cat motherCat = new Cat(motherName, grandmotherCat,null);


        String sonName = reader.readLine();
        Cat sonCat = new Cat(sonName, motherCat, fatherCat);

        String daughterName = reader.readLine();
        Cat daughterCat = new Cat(daughterName, motherCat, fatherCat);



        System.out.println(granddadCat);
        System.out.println(grandmotherCat);
        System.out.println(fatherCat);
        System.out.println(motherCat);
        System.out.println(sonCat);
        System.out.println(daughterCat);



    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "Cat name is " + name + ", no mother " + ", no father ";
            if (mother == null)
                return "Cat name is " + name + ", no mother " + ", father is " + father.name;
            if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father ";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
