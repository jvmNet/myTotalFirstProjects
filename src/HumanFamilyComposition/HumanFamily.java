package HumanFamilyComposition;

public class HumanFamily {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human granddad1 = new Human("Vasiliy", true,57);
        Human granddad2 = new Human("Aleksandr", true,65);

        Human grandmother1 = new Human("Mila",false,52);
        Human grandmother2 = new Human("Marina",false,55);

        Human father = new Human("Inokentii",true,39,granddad1,grandmother1);
        Human mother = new Human("Irina",false,41,granddad2,grandmother2);

        Human son1 = new Human("Denis",true,9,father,mother);
        Human daughter = new Human("Alisa",false,5,father,mother);
        Human son2 = new Human("Dmitrii",true,11,father,mother);

        System.out.println(granddad1.toString());
        System.out.println(granddad2.toString());

        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(son1.toString());
        System.out.println(daughter.toString());
        System.out.println(son2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
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

            return text;
        }
    }
}
