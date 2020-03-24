import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        final int SIZE=100000;
        int i = 0;
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        while (myNumbers.size() < SIZE) {
            myNumbers.add((int) (Math.random() * SIZE));
        }
        for (int y : myNumbers) {
            System.out.print(y+" ");
        }
        System.out.print("\nArray length : "+myNumbers.size());

        StopWatch stopWatch = new StopWatch();
        System.out.println("\nStart time : "+stopWatch.getStartTime()+"\n");

        stopWatch.start();
        Collections.sort(myNumbers);
        stopWatch.stop();

        for (int y : myNumbers) {
            System.out.print(y+" ");
        }
        System.out.println("\nArray length : "+myNumbers.size());
        System.out.println("End time : "+stopWatch.getEndTime());
        System.out.println("\nElapsed time : "+stopWatch.getElapsedTime()+" ms." );
    }
}
