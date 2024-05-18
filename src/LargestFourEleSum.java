import java.util.Arrays;

public class LargestFourEleSum {
    public static void main(String[] args) {
        int[] arr = {4, 5, -2, 3, 1, 2, 6, 6};
        int sum = largestFourEleSum(arr);
        System.out.println("Largest Four Elements Sum is " + sum);
    }

    private static int largestFourEleSum(int[] arr) {
        if (arr.length == 0){
            return 0;
        }
        if (arr.length < 4) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3] + arr[arr.length - 4];
    }
}
