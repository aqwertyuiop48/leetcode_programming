/*
 * @lc app=leetcode id=3886 lang=java
 *
 * [3886] Sum of Sortable Integers
 */

class Solution {
    public int sortableIntegers(int[] nums) {
        return Optional.of(new Object[]{new IntPredicate[1]}).map((Object[] st) -> (((IntPredicate[])st[0])[0] = (len) -> Optional.of(new int[]{0}).map(minn -> IntStream.iterate(0, i -> i < nums.length, i -> i + len).allMatch(i -> nums[i] < minn[0] ? false : Optional.of(new int[]{nums[i], 0}).map(state -> IntStream.range(i + 1, i + len).allMatch(j -> nums[j] < minn[0] ? false : (nums[j - 1] > nums[j] ? (state[1] == 1 ? false : ((state[1] = 1) == 1 && (state[0] = Math.max(state[0], nums[j])) == state[0])) : (state[0] = Math.max(state[0], nums[j])) == state[0])) && (state[1] == 1 ? nums[i] >= nums[i + len - 1] : true) && ((minn[0] = state[0]) == minn[0])).get())).get()) != null ? st : st).map((Object[] st) -> IntStream.rangeClosed(1, nums.length).filter(k -> nums.length % k == 0).filter(k -> ((IntPredicate[])st[0])[0].test(k)).sum()).get();
    }
}
