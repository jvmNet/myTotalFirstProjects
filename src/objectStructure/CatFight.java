package objectStructure;

public class CatFight {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public CatFight() {
    }

    public boolean fight(CatFight anotherCat) {
        //напишите тут ваш код

        if(this.age > anotherCat.age && this.strength > anotherCat.strength){
            return true;
        } else
            return false;
    }

    public boolean fightMethod(CatFight anotherCat){
        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2; // return score > 2 ? true : false;
    }

    public static void main(String[] args) {
        CatFight cat1 = new CatFight();
        cat1.age = 18;
        cat1.weight = 21;
        cat1.strength = 25;

        CatFight cat2 = new CatFight();
        cat2.age = 21;
        cat2.weight = 27;
        cat2.strength = 31;

        System.out.println(cat2.fight(cat1));
    }
}
