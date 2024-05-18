import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArraysWithoutDups {
    public static void main(String[] args) {
        int[] arrA = {1,3,4,7,9,90,44};
        int[] arrB = {6,2,5,6,8,90,14};
        int[] arrRes = Stream.concat(Arrays.stream(arrA).boxed(), Arrays.stream(arrB).boxed())
                .mapToInt(Integer::intValue).sorted().distinct().toArray();
        System.out.println(Arrays.toString(arrRes));
    }
}
