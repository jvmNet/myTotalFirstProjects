package pattern;

interface IMouse {
    void skrollUp();
    void skrollDown();
    void noSkroll();
}

interface IKeyboard {
    void print();
    void println();
}

interface ITouchPad {
    void move(int x, int y);
}

interface ICreateDevice {
    IMouse getMouse();
    IKeyboard getKeyboard();
    ITouchPad getTouchPad();
}

class RuMouse implements IMouse {

    @Override
    public void skrollUp() {
        System.out.println("Мышь вверх");
    }

    @Override
    public void skrollDown() {
        System.out.println("Мышь вниз");
    }

    @Override
    public void noSkroll() {
        System.out.println("Мышь на месте");
    }
}

class RuKeyboard implements IKeyboard {

    @Override
    public void print() {
        System.out.println("Печатаем в строке");
    }

    @Override
    public void println() {
        System.out.println("Петает в новой строке");
    }
}

class RuTouchPad implements ITouchPad {

    @Override
    public void move(int x, int y) {
        int result = x + y;
        System.out.println("Движение " + result);
    }
}

class EnMouse implements IMouse {

    @Override
    public void skrollUp() {
        System.out.println("Mouse UP");
    }

    @Override
    public void skrollDown() {
        System.out.println("Mouse DOWN");
    }

    @Override
    public void noSkroll() {
        System.out.println("Mouse no skroll");
    }
}

class EnKeyboard implements IKeyboard {

    @Override
    public void print() {
        System.out.println("Print in String");
    }

    @Override
    public void println() {
        System.out.println("Print in new String");
    }
}

class EnTouchPad implements ITouchPad {

    @Override
    public void move(int x, int y) {
        int result = x + y;
        System.out.println("Move " + result);
    }
}

class RuCreateDevice implements ICreateDevice {

    @Override
    public IMouse getMouse() {
        return new RuMouse();
    }

    @Override
    public IKeyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public ITouchPad getTouchPad() {
        return new RuTouchPad();
    }
}

class EnCreateDevice implements ICreateDevice {

    @Override
    public IMouse getMouse() {
        return new EnMouse();
    }

    @Override
    public IKeyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public ITouchPad getTouchPad() {
        return new EnTouchPad();
    }
}


public class AbstractFactoryMethod {
    public static void main(String[] args) {

        ICreateDevice createDevice = getDevice("EN");
        IMouse                   m = createDevice.getMouse();
        IKeyboard                k = createDevice.getKeyboard();
        ITouchPad                t = createDevice.getTouchPad();

        m.skrollUp();
        m.noSkroll();
        m.skrollDown();

        k.print();
        k.println();

        t.move(12, 29);

    }

    public static ICreateDevice getDevice(String lang) {
        if(lang.equals("RU"))
            return new RuCreateDevice();

        if(lang.equals("EN"))
            return new EnCreateDevice();

        throw new RuntimeException("No Supported lang" + " " + lang);
    }
}
