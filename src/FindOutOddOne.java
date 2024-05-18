import java.util.ArrayList;
import java.util.List;

public class FindOutOddOne {

    public static void main(String[] args) {
        List<String> list = List.of("ABC", "BCD", "DEF", "DCB");
        String oddOneOut = findOutOddOne(list);
        System.out.println("Odd one out is: " + oddOneOut);
    }

    private static String findOutOddOne(List<String> list) {
        if (list == null || list.size() <= 1) {
            return "";
        }
        String commonPattern = getDifferencePattern(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            String currentPattern = getDifferencePattern(list.get(i));
            if (!commonPattern.equals(currentPattern)) {
                return list.get(i); // Found the odd one out
            }
        }
        return "";
    }

    private static String getDifferencePattern(String str) {
        StringBuilder diffPattern = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            diffPattern.append(str.charAt(i) - str.charAt(i + 1));
        }
        return diffPattern.toString();
    }
}
