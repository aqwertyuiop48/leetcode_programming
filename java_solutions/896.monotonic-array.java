/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        return Arrays.equals(nums,Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray()) || Arrays.equals(nums,Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray());
    }
}
