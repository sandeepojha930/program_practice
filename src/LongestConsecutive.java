import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public static void main(String[] args) {
        LongestConsecutive consecutive = new LongestConsecutive();
        int[] nums = {1,2,0,1};
        System.out.println(consecutive.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> integers = new HashSet<>();
        for (int num : nums){
            integers.add(num);
        }
        int maxLength = 0;
        for (int num: nums){
            if(!integers.contains(num-1)){
                int currentNum = num;
                int currentLength = 1;
                while (integers.contains(currentNum+1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
