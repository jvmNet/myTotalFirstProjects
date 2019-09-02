package multithreading.airport;

public class Plane extends Thread {

    private static final String LINE = "-";
    private static final int SIZE_LINE = 15;
    private static volatile Runway RUNWAY = new Runway();
    private static final int TIME_WAITING = 1000;
    private static final int TIME_TAKING_OFF = 1500;
    private boolean isAlreadyTakingOff = false;

    public Plane(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {

        while(!isAlreadyTakingOff) {

            if(RUNWAY.trySetTakingOffPlane(this)) {
                System.out.println(getName() + " взлетает");
                takingOff();
                System.out.println(getName() + " уже в небе");
                isAlreadyTakingOff = true;
                RUNWAY.setTakingOffPlane(null);
            } else if(!this.equals(RUNWAY.getTakingOffPlane())) {
                System.out.println(getName() + " ожидает");
                waiting();
            }

            showLine(LINE);

        }
    }

    private void showLine(String line) {
        for(int i = 0; i < SIZE_LINE; i++)
            System.out.print(line);
        System.out.println();
    }

    private void waiting() {
        try{
            Thread.sleep(TIME_WAITING);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    private void takingOff() {
        try{
            Thread.sleep(TIME_TAKING_OFF);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
