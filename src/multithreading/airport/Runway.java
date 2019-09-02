package multithreading.airport;

public class Runway {

    private Thread threadRunway;

    public Thread getTakingOffPlane() {
        return threadRunway;
    }

    public void setTakingOffPlane(Thread threadRunway) {
        synchronized (this) {
            this.threadRunway = threadRunway;
        }
    }

    public boolean trySetTakingOffPlane(Thread threadRunway) {
        synchronized (this) {
            if(this.threadRunway == null) {
                this.threadRunway = threadRunway;
                return true;
            }
            return false;
        }
    }
}
