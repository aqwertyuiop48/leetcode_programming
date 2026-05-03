/*
 * @lc app=leetcode id=1630 lang=java
 *
 * [1630] Arithmetic Subarrays
 */

class Solution {
    public java.util.List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        return java.util.stream.IntStream.range(0, l.length).mapToObj(i -> new Object[]{java.util.Arrays.stream(nums, l[i], r[i] + 1).sorted().toArray()} instanceof Object[] o ? java.util.stream.IntStream.range(2, ((int[])o[0]).length).allMatch(j -> ((int[])o[0])[j] - ((int[])o[0])[j-1] == ((int[])o[0])[1] - ((int[])o[0])[0]) : false).collect(java.util.stream.Collectors.toList());
    }
}
