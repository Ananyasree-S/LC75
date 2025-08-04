/**
1493. Longest Subarray of 1's After Deleting One Element

Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
**/

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0; int zeros = 0; int maxlen = 0;

        for(int right =0;right<nums.length;right++){
            if(nums[right] == 0) zeros++;
            if(zeros>1){
                if(nums[left]==0) zeros--;
                left++;
            }
        maxlen = Math.max(maxlen, right - left );
        }
        return maxlen;
    }
}
