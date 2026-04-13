/*
 * @lc app=leetcode id=3430 lang=java
 *
 * [3430] Maximum and Minimum Sums of at Most Size K Subarrays
 */

class Solution {
    public long minMaxSubarraySum(int[] nums, int k) {
        return LongStream.of(1, 0).map(isMin -> (Long) Stream.iterate(new Object[] { 0, 0, ((Function<int[], int[]>) (arr -> new Object[]{arr[0] = -1}[0] == null ? arr : arr)).apply(new int[nums.length + 2]), 0L }, s -> (int) s[0] <= nums.length, s -> ((int) s[1] > 0 && ((int) s[0] == nums.length || (isMin == 1 ? nums[((int[]) s[2])[(int) s[1]]] >= nums[(int) s[0]] : nums[((int[]) s[2])[(int) s[1]]] <= nums[(int) s[0]]))) ? new Object[] { s[0], (int) s[1] - 1, s[2], (long) s[3] + nums[((int[]) s[2])[(int) s[1]]] * ((Function<int[], Long>) (mlr -> ((Function<int[], Long>) (bounds -> bounds[1] - bounds[0] < k ? (mlr[0] - bounds[0] + 1L) * (bounds[1] - mlr[0] + 1L) : (mlr[0] - bounds[0] < bounds[1] - mlr[0] ? LongStream.rangeClosed(bounds[0], mlr[0]).map(l -> Math.max(Math.min(mlr[2], (int) l + k - 1) - mlr[0] + 1, 0)).sum() : LongStream.rangeClosed(mlr[0], bounds[1]).map(r -> Math.max(mlr[0] - Math.max((int) r - k + 1, mlr[1]) + 1, 0)).sum()))).apply(new int[] { Math.max(mlr[1], mlr[0] - k + 1), Math.min(mlr[0] + k - 1, mlr[2]) }))).apply(new int[] { ((int[]) s[2])[(int) s[1]], ((int[]) s[2])[(int) s[1] - 1] + 1, (int) s[0] - 1 }) } : new Object[] { (int) s[0] + 1, (int) s[1] + 1, ((Function<int[], int[]>) (arr -> new Object[]{arr[(int) s[1] + 1] = (int) s[0]}[0] == null ? arr : arr)).apply((int[]) s[2]), s[3] }).reduce((first, second) -> second).get()[3]).sum();
    }
}
