import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElemInArr {
    public static int kthLargestElemInArr(int[] nums, int k){
        /*Arrays.sort(nums);
        return nums[nums.length -k];*/
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for(int i: nums){
            priorityQueue.offer(i);
            if(priorityQueue.size()> k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
