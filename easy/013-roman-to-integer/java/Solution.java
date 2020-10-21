class Solution {
    public Solution() { }

    public int romanToInt(String s) {
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
}
