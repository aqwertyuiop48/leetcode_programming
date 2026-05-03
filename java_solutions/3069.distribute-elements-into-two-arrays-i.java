/*
 * @lc app=leetcode id=3069 lang=java
 *
 * [3069] Distribute Elements Into Two Arrays I
 */

class Solution {
    public int[] resultArray(int[] nums) {
        if (new Object[]{new int[nums.length], new int[nums.length], new int[nums.length]} instanceof Object[] o && o[0] instanceof int[] a1 && o[1] instanceof int[] a2 && o[2] instanceof int[] res && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ra", nums) != null | true)) {
            if (nums.length >= 2 && ((a1[0] = nums[0]) | 1) != 0 && ((a2[0] = nums[1]) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (a1[v[1] - 1] > a2[v[2] - 1]) {
                        if (((a1[v[1]++] = nums[v[0]]) | 1) != 0) {}
                    } else {
                        if (((a2[v[2]++] = nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < v[1]) {
                        if (((res[v[3]++] = a1[v[0]++]) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < v[2]) {
                            if (((res[v[3]++] = a2[v[0]++]) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ra", res) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ra");
    }
}
