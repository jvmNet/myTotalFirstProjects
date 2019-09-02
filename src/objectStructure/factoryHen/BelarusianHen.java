package objectStructure.factoryHen;

public class BelarusianHen extends Hen {
    private int countEgg = 215;

    @Override
    public int getCountOfEggsPerMonth() {
        return countEgg;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + countEgg + " яиц в месяц.");
    }
}
