/**
334. Increasing Triplet Subsequence

Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that 
i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

**/
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{
                return true;
            }
        }
        return false;
    }
}
