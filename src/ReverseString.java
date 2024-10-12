public class ReverseString {
    public static void main(String[] args) {
        String str = "ab$cd#ef%gh^ij*";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString(str));
    }

    private static String reverseString(String str) {
        int start = 0, end = str.length() - 1;
        char[] charArr = str.toCharArray();

        while (start < end) {
            // Skip non-alphabetic characters at the start
            if (!Character.isLetterOrDigit(charArr[start])) {
                start++;
            }
            // Skip non-alphabetic characters at the end
            else if (!Character.isLetterOrDigit(charArr[end])) {
                end--;
            }
            // Swap when both are alphabetic
            else {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(charArr);
    }
}
