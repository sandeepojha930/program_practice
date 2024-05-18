import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] arr, int k, int n) {
        int[] res = new int[arr.length];
        int last = n - 1;
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                res[i] = arr[last];
                last--;
                if (k-- == 1) {
                    last = 0;
                }
            } else if (k == 0) {
                res[i] = arr[last];
                last++;
            }
        }
        arr = res;
        System.out.println(Arrays.toString(arr));
    }
}
