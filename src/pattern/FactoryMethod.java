package pattern;

import java.util.Date;

interface IWatch {
    void showTime();
}

interface IWatchMaker {
    IWatch createWatch();
}

class RomeWatchMaker implements IWatchMaker {

    @Override
    public IWatch createWatch() {
        return new RomeWatch();
    }
}

class RomeWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println("XVII-VI");
    }
}

class DigitalWatchMaker implements IWatchMaker {

    @Override
    public IWatch createWatch() {
        return new DigitalWatch();
    }
}

class DigitalWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class AnotherWatchMaker implements IWatchMaker {

    @Override
    public IWatch createWatch() {
        return new AnotherWatch();
    }
}

class AnotherWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println("Another watch maker");
    }
}

public class FactoryMethod {
    public static void main(String[] args) {

        IWatchMaker maker = getWatchMaker("Digital");
        IWatch watch = maker.createWatch();
        watch.showTime();

    }

    public static IWatchMaker getWatchMaker(String nameMaker) {
        if(nameMaker.equals("Rome"))
            return new RomeWatchMaker();

        if(nameMaker.equals("Digital"))
            return new DigitalWatchMaker();

        return new AnotherWatchMaker();
    }
}
