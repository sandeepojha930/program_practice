public class MaxAreaSolution {

    public static void main(String[] args) {
        MaxAreaSolution areaSolution = new MaxAreaSolution();
        int[] heights = {1,1};
        System.out.println(areaSolution.maxArea(heights));
    }

    public int maxArea(int[] heights) {
        int maxArea = 0;
        int start = 0;
        int end = heights.length - 1;
        while (start < end) {
            int minHeight = Math.min(heights[start], heights[end]);
            int width = end - start;
            int currentArea = minHeight * width;
            maxArea = Math.max(maxArea, currentArea);
            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
