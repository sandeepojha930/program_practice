public class FirstMissingPositiveNum {
    public static void main(String[] args) {
        String s = "BAAABAB";
        int res = solution(s);
        System.out.println("Result: " + res);
    }

    private static int solution(String s) {
        int n = s.length();
        int[] leftCount = new int[n + 1];
        int[] rightCount = new int[n + 1];
        for (int i = 0; i < n; i++) {
            leftCount[i + 1] = leftCount[i] + (s.charAt(i) == 'B' ? 1 : 0);
        }
        for (int i = n - 1; i >= 0; i--) {
            rightCount[i] = rightCount[i + 1] + (s.charAt(i) == 'A' ? 1 : 0);
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            minDiff = Math.min(minDiff, leftCount[i] + rightCount[i]);
        }
        return minDiff;
    }
}
