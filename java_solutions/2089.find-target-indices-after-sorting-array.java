/*
 * @lc app=leetcode id=2089 lang=java
 *
 * [2089] Find Target Indices After Sorting Array
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        return IntStream.range(
            (int) Arrays.stream(nums).filter(n -> n < target).count(), 
            (int) (Arrays.stream(nums).filter(n -> n < target).count() + Arrays.stream(nums).filter(n -> n == target).count())
        ).boxed().collect(Collectors.toList());
    }
}
