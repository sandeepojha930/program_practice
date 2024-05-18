public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, -2, 4};
        int result = maxProduct(arr);
        System.out.println("Max Product: " + result);
    }

    /*
    * Detailed Explanation:
A lot of people asked about why can we get the max by calculating the products from start and end, Here is all you should know:
First, Consider there is no zero, and if we get the products of all the numbers:
1) We will have a negative result if there are odd numbers of negative -> max ((product of (0, last negative)), (product of (first negative, last num))
2) We will have a positive result if there are even numbers of negative -> product of all the numbers
Above all, we can get the max by going through the array from both start and end, then we won't miss any situations
If there is a zero, that means we would have two subproblems(unless the zero is at index 0 or last index), if two zeros, 3 subs, all the way up. We still can calculate from the very beginning and end at the same time, then we would get the result.
*/
    private static int maxProduct(int[] nums) {
        int result = nums[0], l = 0, r = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            l = (l == 0 ? 1 : l) * nums[i];
            r = (r == 0 ? 1 : r) * nums[n - 1 - i];
            result = Math.max(result, Math.max(l, r));
        }
        return result;
    }
}
