package day_44;

public class Code2 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        result[0] = findFirstOccurrence(nums, target);
        result[1] = findLastOccurrence(nums, target);

        return result;
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid; 
                } else {
                    right = mid - 1;  }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    private int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;            } else {
                    left = mid + 1;           }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;   }

    public static void main(String[] args) {
  
        Code2 solution = new Code2();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int target2 = 6;

        int[] result1 = solution.searchRange(nums, target1);
        int[] result2 = solution.searchRange(nums, target2);

        System.out.println("Result for target " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result for target " + target2 + ": [" + result2[0] + ", " + result2[1] + "]");
    }
}
