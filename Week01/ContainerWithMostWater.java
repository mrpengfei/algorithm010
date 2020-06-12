/**
 * 11.盛最多水的容器
 */
public class ContainerWithMostWater {
    public static void main(final String[] args) {
        int maxArea = maxArea2(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
        System.out.println(maxArea);
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int inputArrayLength = height.length;
        for (int i = 0; i < inputArrayLength; i++) {
            for (int j = inputArrayLength - 1; j > i; j--) {
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int maxArea2(int[] height) {
        int maxArea = 0, i = 0, j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
                continue;
            }
            i++;
        }
        return maxArea;
    }
}