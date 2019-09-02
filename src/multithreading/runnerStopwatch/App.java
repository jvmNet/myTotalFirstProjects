package multithreading.runnerStopwatch;

import multithreading.runnerStopwatch.controller.Runner;
import multithreading.runnerStopwatch.controller.Stopwatch;

public class App {

    public static void main(String[] args) {

        Runner ivanov = new Runner("Ivanov", 5);
        Runner petrov = new Runner("Petrov", 3);
        Runner sidorov = new Runner("Sidorov", 9);

        ivanov.start();
        petrov.start();
        sidorov.start();

        ivanov.runs(1000);
        petrov.runs(1000);
        sidorov.runs(1000);

        Stopwatch.setIsStop(true);

    }



}
