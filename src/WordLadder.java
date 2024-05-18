import java.util.LinkedList;
import java.util.Set;

public class WordLadder {
    public static int wordLadder(String beginStr, String endStr, Set<String> list) {
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginStr, 1));
        list.add(endStr);
        while (!queue.isEmpty()) {
            WordNode wordNode = queue.remove();
            String word = wordNode.word;
            if (word.equals(endStr))
                return wordNode.numSteps;
            char[] chrArr = word.toCharArray();
            for (int i = 0; i < chrArr.length; i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char temp = chrArr[i];
                    if (chrArr[i] != ch) {
                        chrArr[i] = ch;
                    }
                    String newWord = new String(chrArr);
                    if (list.contains(newWord)) {
                        queue.add(new WordNode(newWord, wordNode.numSteps + 1));
                        list.remove(newWord);
                    }
                    chrArr[i] = temp;
                }
            }
        }
        return 0;
    }
}

class WordNode {
    String word;
    int numSteps;

    public WordNode(String word, int numSteps) {
        this.word = word;
        this.numSteps = numSteps;
    }
}