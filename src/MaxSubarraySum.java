public class MaxSubarraySum {
    public static void main(String[] args) {
        MaxSubarraySum solver = new MaxSubarraySum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sub array sum :"+solver.maxSubArraySum(nums));
    }

    private int maxSubArraySum(int[] nums) {
     int maxSum = nums[0];
     int maxCurrent = nums[0];
     for(int i =1; i < nums.length; i++){
         maxCurrent = Math.max(nums[i], maxCurrent+nums[i]);
         maxSum = Math.max(maxSum, maxCurrent);
     }
     return maxSum;
    }
}
