public class ConsecutiveArrEle {
    public static void main(String[] args) {
        int [] arr = {4,6,8};
        int res = consecutive(arr);
        System.out.println(res+" numbers are missing");
    }

    private static int consecutive(int[] arr) {
        if (arr.length < 2)
            return 0;
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i =0; i< arr.length;i++){
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
        }
        int diff = (maxValue - minValue) + 1;
        return  diff - arr.length;
    }
}
