public class IndexFirstOccurrenceStr {

    public static void main(String[] args) {
        IndexFirstOccurrenceStr firstOccurrenceStr = new IndexFirstOccurrenceStr();
        int index = firstOccurrenceStr.strStr("leetcode", "o");
        System.out.println(index);
    }

    public int strStr(String haystack, String needle) {
   return haystack.indexOf(needle);
    }
}
