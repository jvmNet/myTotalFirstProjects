package objectStructure;

public class Animals {
    private int cat_age = 0,
                dog_age = 0;

    public static void main(String[] args) {

        Tod tod = new Tod("Bob",18);
        System.out.println(tod);

    }
    public static class Tod{
        private static String name;
        private static int age;
        private Tod(){}
        private Tod(String name){this.name = name;}
        private Tod(String name, int age){this.name = name; this.age = age;}
        public String toString(){return name + " " + age;}
    }

    public int getCat(){
        return cat_age;
    }
    public void setCat(int cat_age){
        this.cat_age = cat_age;
    }
    public int getDog (){
        return dog_age;
    }
    public void setDog (int dog_age){
            this.dog_age = dog_age;
    }
}

