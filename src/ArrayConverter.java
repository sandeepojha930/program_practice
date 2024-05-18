import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayConverter {
    //Problem Statement : (5,8,1,5,8,5) -> (5,5,5,8,8,1)

    public static void main(String[] args) {
        int[] arr = {5,8,1,5,8,5};
        Map<Integer, Integer> map = new LinkedHashMap<>(arr.length);
        for (int val : arr) {
            if (map.containsKey(val)) {

            }
        }

    }
}
