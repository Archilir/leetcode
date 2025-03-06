package leetcode.generic;

public abstract class Executor {

    public void printSolutionTitle(String title) {
        System.out.println(title);
    }

    public void printElapsedTimeInMilliseconds(long startTime, long endTime) {
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        long estimatedTime = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + (estimatedTime/1000000) + "\n");
    }
}
