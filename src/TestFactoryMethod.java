import java.util.Date;

interface IWatch {
    void showTime();
}

interface IFactoryWatch {
    IWatch createWatch();
}

class DigitalWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class FactoryDigitalWatch implements IFactoryWatch {

    @Override
    public IWatch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println("XVII-IV");
    }
}

class FactoryRomeWatch implements IFactoryWatch {

    @Override
    public IWatch createWatch() {
        return null;
    }
}

public class TestFactoryMethod {
    public static void main(String[] args) {
        IFactoryWatch maker = getFactoryWatch("Digital");
        IWatch watch = maker.createWatch();
        watch.showTime();
    }

    private static IFactoryWatch getFactoryWatch(String maker) {
        if(maker.equals("Rome"))
            return new FactoryRomeWatch();
        if(maker.equals("Digital"))
            return new FactoryDigitalWatch();
        throw new RuntimeException("Another Maker");
    }
}

