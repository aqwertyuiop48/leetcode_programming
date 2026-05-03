/*
 * @lc app=leetcode id=3289 lang=java
 *
 * [3289] The Two Sneaky Numbers of Digitville
 */

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        if (new int[105] instanceof int[] cnt && new int[2] instanceof int[] res && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tsn", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((cnt[nums[v[0]]] += 1) | 1) != 0 && cnt[nums[v[0]]] == 2) {
                        if (((res[v[1]++] = nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "tsn");
    }
}
