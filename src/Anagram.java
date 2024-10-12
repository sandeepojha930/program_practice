import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "notionH";
        String str2 = "Htinnoo";
        boolean flag = isStringAnagram(str1, str2);
        System.out.println(str1 +" and "+ str2+"are anagram: "+flag);
    }

    private static boolean isStringAnagram(String str1, String str2) {
        /*char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        return String.valueOf(str1Arr).equals(String.valueOf(str2Arr));*/
        if (str1.length() != str2.length())
            return false;
        int[] charCount = new int[52];
        for (int i =0; i< str1.length();i++){
            if (Character.isUpperCase(str1.charAt(i))) {
                charCount[str1.charAt(i) - 'A']++;
            } else {
                charCount[str1.charAt(i) - 'a' + 26]++;
            }

            if (Character.isUpperCase(str2.charAt(i))) {
                charCount[str2.charAt(i) - 'A']--;
            } else {
                charCount[str2.charAt(i) - 'a' + 26]--;
            }
        }
        for(int i: charCount){
            if (i != 0)
                return false;
        }
        return true;
    }
}
