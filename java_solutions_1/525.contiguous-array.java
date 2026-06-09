/*
 * @lc app=leetcode id=525 lang=java
 *
 * [525] Contiguous Array
 */

class Solution {
    public int findMaxLength(int[] nums) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new int[]{0}, new int[]{0}}).peek(a -> ((java.util.Map<Integer, Integer>) a[0]).put(0, -1)).peek(a -> java.util.stream.IntStream.range(0, nums.length).forEach(i -> java.util.stream.Stream.of(0).peek(_x -> ((int[]) a[1])[0] += nums[i] == 1 ? 1 : -1).peek(_x -> java.util.stream.Stream.of(0).filter(_y -> ((java.util.Map<Integer, Integer>) a[0]).containsKey(((int[]) a[1])[0])).forEach(_y -> ((int[]) a[2])[0] = Math.max(((int[]) a[2])[0], i - ((java.util.Map<Integer, Integer>) a[0]).get(((int[]) a[1])[0])))).forEach(_x -> ((java.util.Map<Integer, Integer>) a[0]).putIfAbsent(((int[]) a[1])[0], i)))).map(a -> ((int[]) a[2])[0]).findFirst().get();
    }
}
