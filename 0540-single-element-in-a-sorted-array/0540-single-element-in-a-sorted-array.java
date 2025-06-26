class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 2;

        while(low <= high) {
            int mid = (low + high) >> 1; // Using >> 1 is same as dividing by 2

            // If mid is even: mid ^ 1 = mid + 1 
            // If mid is odd:  mid ^ 1 = mid - 1

            if(nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;  // shrink left half
            }
            else {
                high = mid - 1; // shrink right half
            }
        }
        return nums[low];
    }
}