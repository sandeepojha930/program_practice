import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,3,3,3};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int uniqueCount=1;
        for(int i =1;i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueCount++] = nums[i];
            }
        }
        return uniqueCount;
    }
}
