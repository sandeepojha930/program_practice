import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int val = 1;
        int k = removeElement(nums, val);
        System.out.println(k + " : " + Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) {
            nums[0] = -1;
            return 0;
        } else if (nums.length == 1 && nums[0] != val) {
            return 1;
        }
        int l = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (l >= 0 && nums[l] == val) {
                    nums[l--] = -1;
                }
                if (nums[i] == val) {
                    nums[i] = nums[l];
                    nums[l--] = -1;
                }
            }
        }
        return l + 1;
    }
}
