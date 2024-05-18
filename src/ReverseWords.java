import java.util.StringJoiner;

public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String str = "a good   example";
        String rvsStr = reverseWords.reverseWords(str);
        System.out.println("'"+rvsStr+"'");
    }

    private String reverseWords(String s) {
        String[] strArr = s.split("\\s");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (!strArr[i].isBlank()) {
                joiner.add(strArr[i]);
            }
        }
        return joiner.toString();
    }
}
