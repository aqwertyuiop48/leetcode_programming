/*
 * @lc app=leetcode id=2341 lang=java
 *
 * [2341] Maximum Number of Pairs in Array
 */

class Solution {
    public int[] numberOfPairs(int[] nums) {
        return Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .values().stream()
            .map(count -> new int[]{(int) (count / 2), (int) (count % 2)})
            .reduce(new int[2], (a, b) -> new int[]{a[0] + b[0], a[1] + b[1]});
    }
}
