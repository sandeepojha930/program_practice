import java.util.HashMap;
import java.util.Map;

class LongestSubstringUniqueChars {

    public static void main(String[] args) {
        // Your code goes here
        String s = "ABDEFGABEF";
        System.out.println(longestSubstringWithUniqueChars(s));
    }

    public static String longestSubstringWithUniqueChars(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }
        }