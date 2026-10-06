/*
 * @lc app=leetcode id=955 lang=java
 *
 * [955] Delete Columns to Make Sorted II
 */

class Solution {
    public int minDeletionSize(String[] strs) {
        return new boolean[strs.length] instanceof boolean[] done
            ? (int) java.util.stream.IntStream.range(0, strs[0].length()).filter(c -> java.util.stream.IntStream.range(0, strs.length - 1).anyMatch(i -> !done[i] && strs[i].charAt(c) > strs[i + 1].charAt(c))
                || java.util.stream.IntStream.range(0, strs.length - 1).filter(i -> strs[i].charAt(c) < strs[i + 1].charAt(c)).peek(i -> done[i] = true).count() < 0).count()
            : 0;
    }
}
