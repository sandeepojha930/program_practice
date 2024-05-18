import java.util.Arrays;

public class RemoveDuplicatesAtMostTwice {

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println("Length: "+k+" Array: "+ Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int uniqueCount = 2; // Initialize with 2 since the first two elements are always unique
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 2]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
