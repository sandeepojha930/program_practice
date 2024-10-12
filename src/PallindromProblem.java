public class PallindromProblem {

    public static void main(String[] args) {
        String str = "racecar";
        boolean res = isPalindrome(str);
        System.out.println(str + " is palindrome: " + res);
        System.out.println(addShortestPathToMakePalindrome("race"));
        System.out.println(addShortestPathToMakePalindrome("add"));

    }

    private static String addShortestPathToMakePalindrome(String prefix) {
        StringBuilder sb = new StringBuilder(prefix);
        for (int i = 0; i < prefix.length(); i++) {
            if (isPalindrome(sb.toString())) {
                return sb.toString();
            }
           sb.insert(prefix.length(), prefix.charAt(i));
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
