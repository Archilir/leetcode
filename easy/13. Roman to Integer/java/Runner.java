public class Runner {
    public static void main(String args[]) {
        String s = "MMCLXIV";

        Solution solver = new Solution();

        int solution = solver.romanToInt(s);
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Output: " + solution);
    }

}
