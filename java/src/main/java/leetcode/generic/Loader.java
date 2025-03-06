package leetcode.generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Loader {
        private List<Runner> solutions = new ArrayList<>();

        public List<Runner> getSolutions() {
            return solutions;
        }

        public void add(Runner solution) {
            solutions.add(solution);
        }
}
