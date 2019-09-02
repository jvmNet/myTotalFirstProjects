package objectStructure.factoryHen;

public class MoldovanHen extends Hen {
    private int countEgg = 51;

    @Override
    public int getCountOfEggsPerMonth() {
        return countEgg;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA +
                ". Я несу " + countEgg + " яиц в месяц.");
    }
}
