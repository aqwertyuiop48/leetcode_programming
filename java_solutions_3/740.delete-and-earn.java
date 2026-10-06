/*
 * @lc app=leetcode id=740 lang=java
 *
 * [740] Delete and Earn
 */

class Solution {
    public int deleteAndEarn(int[] nums) {
        return new int[10001] instanceof int[] sum && java.util.Arrays.stream(nums).peek(x -> sum[x] += x).allMatch(x -> true)
            ? java.util.Arrays.stream(sum).boxed().reduce(new int[2], (a, s) -> new int[]{a[1], Math.max(a[1], a[0] + s)}, (a, b) -> a)[1] : 0;
    }
}
