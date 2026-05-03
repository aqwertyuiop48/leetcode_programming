/*
 * @lc app=leetcode id=2191 lang=java
 *
 * [2191] Sort the Jumbled Numbers
 */

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        if (new int[nums.length][3] instanceof int[][] arr && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sj", nums) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                    if (v[1] == 0) { if (((v[2] = mapping[0]) | 1) != 0) {} }
                    else {
                        while (v[1] > 0) { if (((v[2] += mapping[v[1] % 10] * v[3]) | 1) != 0 && ((v[3] *= 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                    }
                    if (((arr[v[0]][0] = v[2]) | 1) != 0 && ((arr[v[0]][1] = v[0]) | 1) != 0 && ((arr[v[0]][2] = nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if ((arr = java.util.Arrays.stream(arr).sorted((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && new int[nums.length] instanceof int[] ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((ans[v[0]] = arr[v[0]][2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "sj", ans) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "sj");
    }
}
