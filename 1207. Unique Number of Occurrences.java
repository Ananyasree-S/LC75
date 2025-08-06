/**
1207. Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.**/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqmap = new HashMap<>();
        for(int num : arr){
            freqmap.put(num, freqmap.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>(freqmap.values());
        return set.size() == freqmap.size();
    }
}
