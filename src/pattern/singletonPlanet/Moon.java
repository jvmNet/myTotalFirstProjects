package pattern.singletonPlanet;

public class Moon implements Planet {
    private static final Object sync = new Object();
    private static Moon instance = null;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null)
            synchronized (sync) {
                if (instance == null) {
                    instance = new Moon();
                    return instance;
                }
            }
        return instance;
    }
}
