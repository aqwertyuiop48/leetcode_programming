/*
 * @lc app=leetcode id=1018 lang=java
 *
 * [1018] Binary Prefix Divisible By 5
 */

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        return Arrays.stream(new int[][]{{0}}).flatMap(state -> Arrays.stream(nums).mapToObj(n -> (state[0] = (state[0] * 2 + n) % 5) == 0)).collect(Collectors.toList());
    }
}
