package testExample;

interface Watch {
    void showTime();
}

interface MakerWatch {
    Watch getWatch();
}

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("XIV-VI");
    }
}

class MakerRomeWatch implements MakerWatch {

    @Override
    public Watch getWatch() {
        return new RomeWatch();
    }
}

public class TestExampleFive {

    public static void main(String[] args) {

        MakerWatch maker = new MakerRomeWatch();
        Watch watch = maker.getWatch();

        watch.showTime();

    }

}
