package LogicalProgramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch");
        sc.nextLine();
        long startTime = System.currentTimeMillis();

        System.out.println("Press enter to stop the stopwatch");
        sc.nextLine();
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println("Elapsed time : " + (timeElapsed/1000.0) + "seconds");
        sc.close();


    }
}
