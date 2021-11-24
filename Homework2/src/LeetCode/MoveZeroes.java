package LeetCode;

public class MoveZeroes {
    public static int[] solution(int[] nums) {
        //Double Pointers
        int left = 0, right = left + 1;

        while ( right < nums.length ) {
            int temp = 0;
            if ( nums[left] == 0 && nums[right] != 0 ) {
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
            if ( nums[right] == 0 ) {
                right++;
            }
            if ( nums[left] != 0 ) {
                left++;
            }
        }
        return nums;
    }
}
