/**
2215. Find the Difference of Two Arrays

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
**/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        Set<Integer> onlyIn1 = new HashSet<>(set1);
        onlyIn1.removeAll(set2);
        Set<Integer> onlyIn2 = new HashSet<>(set2);
        onlyIn2.removeAll(set1);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer> (onlyIn1));
        res.add(new ArrayList<Integer> (onlyIn2));

        return res;
    }
}
