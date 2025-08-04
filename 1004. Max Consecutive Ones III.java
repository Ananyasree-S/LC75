/**
1004. Max Consecutive Ones III

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
**/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zeros = 0, maxlen = 0;

        while( right < nums.length){
            if(nums[right]==0) zeros++;

            while(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
}
