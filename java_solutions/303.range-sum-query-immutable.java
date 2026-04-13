/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

record NumArray(int[] p) {
    public int sumRange(int l, int r) {
        return Arrays.stream(p, l, r + 1).sum();
    }
}
