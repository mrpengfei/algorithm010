public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes3(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZeroes3(int[] nums) {
        int length = 0;
        if (nums == null || (length = nums.length) <= 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}