import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashing {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = {7,8,9,3,6};
        int[] ind = twoSum(arr, target);
        System.out.println(Arrays.toString(ind));
    }

    private static int[] twoSum(int[] arr, int target) throws IllegalArgumentException{
        Map<Integer, Integer> map = new HashMap();
        for(int i =0; i< arr.length;i++){
            int comp = target - arr[i];
            if (map.containsKey(comp)){
                return  new int[] {map.get(comp), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No record found");
    }
}
