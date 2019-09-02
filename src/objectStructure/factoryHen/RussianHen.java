package objectStructure.factoryHen;

public class RussianHen extends Hen {
    private int countEgg = 115;

    @Override
    public int getCountOfEggsPerMonth() {
        return countEgg;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA +
                ". Я несу " + countEgg + " яиц в месяц.");
    }
}
