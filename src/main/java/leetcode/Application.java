package leetcode;

import leetcode.solutions.easy.EasySolutions;
import leetcode.generic.Runner;
import leetcode.solutions.medium.MediumSolutions;

public class Application {
    public static void main(String[] args) {
        EasySolutions easySolutions = new EasySolutions();
        MediumSolutions mediumSolutions = new MediumSolutions();

        System.out.println("\n========\nEasy solutions\n========");
        long startTime = System.currentTimeMillis();
        for (Runner solution: easySolutions.getSolutions()) {
            solution.run();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL Execution time in nanoseconds: " + (endTime-startTime) + "\n========");

        System.out.println("\n========\nMedium solutions\n========");
        startTime = System.currentTimeMillis();
        for (Runner solution: mediumSolutions.getSolutions()) {
            solution.run();
        }
        endTime = System.currentTimeMillis();
        System.out.println("TOTAL Execution time in nanoseconds: " + (endTime-startTime) + "\n========");
    }
}
