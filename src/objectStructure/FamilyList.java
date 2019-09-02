package objectStructure;

import java.util.ArrayList;

public class FamilyList {
    public static void main(String[] args) {

        ArrayList<Human> childCildren = new ArrayList<Human>();
        Human child1 = new Human("Иванов Борис",true, 10, childCildren);
        Human child2 = new Human("Иванова Ольга",false,7, childCildren);
        Human child3 = new Human("Иванова Елена", false, 12, childCildren);

        ArrayList<Human> childParents = new ArrayList<Human>();
        childParents.add(child1);
        childParents.add(child2);
        childParents.add(child3);
        Human father = new Human("Иванов Александр",true,39, childParents);
        Human mother = new Human("Иванова Маргарита",false,32, childParents);

        ArrayList<Human> childGrand1 = new ArrayList<Human>();
        childGrand1.add(father);
        Human grandfather1 = new Human("Иванов Иван", true, 67, childGrand1);
        Human grandmother1 = new Human("Иванова Ольга", false, 62, childGrand1);
        ArrayList<Human> childGrand2 = new ArrayList<Human>();
        childGrand2.add(mother);
        Human grandfather2 = new Human("Петров Андрей", true, 69, childGrand2);
        Human grandmother2 = new Human("Петрова Ирина", false,61, childGrand2);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;



            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
