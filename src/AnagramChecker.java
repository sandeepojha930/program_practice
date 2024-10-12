public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        System.out.println("Given Strings: " + str1 + " and " + str2 + " are anagrams: " + anagramChecker(str1, str2));
    }

    private static boolean anagramChecker(String str1, String str2) {
        // Null check and length check
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Normalize to lowercase to make it case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Array to count character frequencies
        int[] arr = new int[26]; // Since 'a' to 'z'

        // Increment for characters in str1 and decrement for characters in str2
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++; // Increment for str1
            arr[str2.charAt(i) - 'a']--; // Decrement for str2
        }

        // Check if all values in the array are 0, meaning the frequencies match
        for (int count : arr) {
            if (count != 0) {
                return false; // If any count is non-zero, they are not anagrams
            }
        }

        return true; // They are anagrams
    }
}
