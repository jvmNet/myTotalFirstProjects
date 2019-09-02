package objectStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;

public class Family {
    public static void main(String[] args) throws InterruptedException, Exception, IOException {

        Human granddad1 = new Human("Петр Петрович", true,67);
        Human granddad2 = new Human("Иван Николаевич", true,71);
        Human grandmother1 = new Human("Нина федоровна",false,59);
        Human grandmother2 = new Human("Лариса Михайловна",false,57);
        Human father = new Human("Игорь",true,45, granddad1, grandmother1);
        Human mother = new Human("Ирина",false,37, granddad2, grandmother2);
        Human children1 = new Human("Лилия",false,11, father, mother);
        Human children2 = new Human("Ольга",false,15, father, mother);
        Human children3 = new Human("Павел",true,9, father, mother);

        granddad1.toString();
        granddad2.toString();
        grandmother1.toString();
        grandmother2.toString();
        father.toString();
        mother.toString();
        children1.toString();
        children2.toString();
        children3.toString();


}

    public static class Human {
        private String name;
        private boolean sex;
        private int age;

        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex =  sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            System.out.println(text);
            return  text;
        }
    }
}

