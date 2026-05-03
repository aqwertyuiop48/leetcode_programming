/*
 * @lc app=leetcode id=3159 lang=java
 *
 * [3159] Find Occurrences of an Element in an Array
 */

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        if (new int[nums.length + 5] instanceof int[] pos && new int[queries.length] instanceof int[] res && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ooe", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == x) { if (((pos[++v[1]] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (queries[v[0]] <= v[1]) { if (((res[v[0]] = pos[queries[v[0]]]) | 1) != 0) {} }
                        else { if (((res[v[0]] = -1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ooe");
    }
}
