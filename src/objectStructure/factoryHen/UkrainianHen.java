package objectStructure.factoryHen;

public class UkrainianHen extends Hen {
    private int countEgg = 75;

    @Override
    public int getCountOfEggsPerMonth() {
        return countEgg;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + countEgg + " яиц в месяц.");
    }
}
