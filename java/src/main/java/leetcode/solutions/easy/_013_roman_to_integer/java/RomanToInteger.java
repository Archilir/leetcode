package leetcode.solutions.easy._013_roman_to_integer.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class RomanToInteger extends Executor implements Runner {
    public RomanToInteger() { }

    public int romanToInt(String s){
        int solution = 0;
        char lastChar = ' ';
        s = s.toLowerCase(); // clean up input from uppercase errors
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'i':
                    solution += 1;
                    break;
                case 'v':
                    solution += (lastChar == 'i') ? 3 : 5;
                    break;
                case 'x':
                    solution += (lastChar == 'i') ? 8 : 10;
                    break;
                case 'l':
                    solution += (lastChar == 'x') ? 30 : 50;
                    break;
                case 'c':
                    solution += (lastChar == 'x') ? 80 : 100;
                    break;
                case 'd':
                    solution += (lastChar == 'c') ? 300 : 500;
                    break;
                case 'm':
                    solution += (lastChar == 'c') ? 800 : 1000;
                    break;
            }
            lastChar = s.charAt(i);
        }
        return solution;
    }

    public void run() {
        String s = "MMCLXIV";
        this.run(s);
    }

    public void run(String s) {
        long startTime = System.currentTimeMillis();
        int solution = romanToInt(s);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("13. Roman to Integer");
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }

}
