/*
 * @lc app=leetcode id=3396 lang=java
 *
 * [3396] Minimum Number of Operations to Make Elements in Array Distinct
 */

class Solution {
    public int minimumOperations(int[] nums) {
        if (new int[105] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mod", 0) != null | true)) {
            if (((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] >= 0 && v[1] == 0) {
                    if (((cnt[nums[v[0]]] += 1) | 1) != 0 && cnt[nums[v[0]]] > 1) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mod", (v[0] / 3) + 1) != null | true) {
                            if (((v[1] = 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mod");
    }
}
