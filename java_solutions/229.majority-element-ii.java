/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return Arrays.stream(Arrays.stream(nums) .boxed() .reduce(new int[]{0, 0, 0, 0}, (a, n) -> n == a[0] && a[2]++ >= -1e9 ? a : n == a[1] && a[3]++ >= -1e9 ? a : a[2] == 0 ? new int[]{n, a[1], 1, a[3]} : a[3] == 0 ? new int[]{a[0], n, a[2], 1} : new int[]{a[0], a[1], --a[2], --a[3]}, (a, b) -> a)) .filter(cand -> Arrays.stream(nums).filter(n -> n == cand).count() > nums.length / 3) .distinct() .boxed() .toList();
    }
}
