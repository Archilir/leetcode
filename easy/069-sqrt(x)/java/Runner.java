public class Runner {
    public static void main(String args[]) {
        int x = 2147395600;
        Solution solver = new Solution();

        System.out.println("Input: " + x);
        int solution = solver.mySqrt(x);
        System.out.println("Output: " + solution);
    }
}
