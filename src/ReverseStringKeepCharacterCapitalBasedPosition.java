import javax.xml.stream.events.Characters;

public class ReverseStringKeepCharacterCapitalBasedPosition {

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int start = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (Character.isUpperCase(str.charAt(start))) {
                stringBuilder.append(Character.toUpperCase(c));
            } else {
                stringBuilder.append(Character.toLowerCase(c));
            }
            start++;
        }
        return stringBuilder.toString();
    }
}
