package tests;

import java.util.Arrays;
import java.util.Timer;

/**
 * Created by Dvir on 02/11/2015.
 */
public class DwarfsAndLamps {

    public static void main(String[] args) {

        int times = 100000;

        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i <times; i++) {
            run(true);
        }
        sw.stop();

        System.out.printf("Time elapsed in efficient mode in milliseconds: %d%n", sw.getTimeElapsed());

        sw.start();
        for (int i = 0; i < times; i++) {
            run(false);
        }
        sw.stop();

        System.out.printf("Time elapsed in inefficient mode in milliseconds: %d", sw.getTimeElapsed());
    }

    public static void run(boolean eMode) {

        int size = 101;
        boolean[] lamps = new boolean[size];
        Arrays.fill(lamps, false);

        // Each dwarf
        for (int i = 1; i < size; i++) {

            StringBuilder sb = new StringBuilder("Lamps switched by dwarf ").append(i).append(": ");

            // For efficiency, no point of looping if i is bigger than half of size
            if (eMode && i > (size / 2)) {
                sb.append(i).append(" (efficient)");
                lamps[i] = !lamps[i];
            }
            else {
                // Each Lamp
                for (int j = 1; j < size; j++) {
                    if (j % i == 0) {
                        sb.append(j).append(", ");
                        lamps[j] = !lamps[j];
                    }
                }
            }

            String s = sb.toString();
            if (s.endsWith(", ")) {
                s = s.substring(0, s.length() - 2);
            }

//            System.out.println(s);
        }
    }
}

class StopWatch {
    private long start;
    private long end;

    public void start() {
        this.start = System.currentTimeMillis();
    }

    public void stop() {
        this.end = System.currentTimeMillis();
    }

    public long getTimeElapsed() {
        if (end <= start) {
            throw new RuntimeException("Fuck off no way");
        }
        return end - start;
    }
}
