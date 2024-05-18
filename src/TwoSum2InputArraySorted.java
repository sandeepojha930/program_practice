import java.util.Arrays;

public class TwoSum2InputArraySorted {

    public static void main(String[] args) {
        TwoSum2InputArraySorted arraySorted = new TwoSum2InputArraySorted();
        int[] numbers = {0,0,3,4};
        int target = 0;
        System.out.println(Arrays.toString(arraySorted.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {

       int left =0, right = numbers.length -1;
       while (left < right){
           int sum = numbers[left]+numbers[right];
           if (target == sum){
               return new int[]{left + 1, right + 1};
           }
           if (target < sum){
               right--;
           }
           if (target > sum){
               left++;
           }
       }
        return new int[]{};
    }
}
