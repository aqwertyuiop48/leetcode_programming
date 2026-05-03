/*
 * @lc app=leetcode id=3080 lang=java
 *
 * [3080] Mark Elements on Array by Performing Queries
 */

class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        if (new long[queries.length] instanceof long[] ans && new int[100005] instanceof int[] valMap && new int[nums.length + 5] instanceof int[] sortedIdx && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mea", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0) {
                while (v[0] < nums.length) { if (((valMap[nums[v[0]]] += 1) | 1) != 0 && ((lv[0] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 1) | 1) != 0) { while (v[0] <= 100000) { if (((valMap[v[0]] += valMap[v[0] - 1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} } }
                if (((v[0] = nums.length - 1) | 1) != 0) { while (v[0] >= 0) { if (((sortedIdx[--valMap[nums[v[0]]]] = v[0]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} } }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (nums[queries[v[0]][0]] != 0) { if (((lv[0] -= nums[queries[v[0]][0]]) | 1) != 0 && ((nums[queries[v[0]][0]] = 0) | 1) != 0) {} }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < queries[v[0]][1] && v[1] < nums.length) {
                                if (nums[sortedIdx[v[1]]] != 0) {
                                    if (((lv[0] -= nums[sortedIdx[v[1]]]) | 1) != 0 && ((nums[sortedIdx[v[1]]] = 0) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((ans[v[0]] = lv[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (long[]) System.getProperties().get(Thread.currentThread().getId() + "mea");
    }
}
