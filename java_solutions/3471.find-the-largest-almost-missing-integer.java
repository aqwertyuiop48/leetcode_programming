/*
 * @lc app=leetcode id=3471 lang=java
 *
 * [3471] Find the Largest Almost Missing Integer
 */

class Solution {
    public int largestInteger(int[] nums, int k) {
        if (new int[55] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lai", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length - k) {
                    if (new int[55] instanceof int[] seen && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < k) {
                            if (seen[nums[v[0] + v[1]]] == 0) {
                                if (((seen[nums[v[0] + v[1]]] = 1) | 1) != 0 && ((cnt[nums[v[0] + v[1]]] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 50) | 1) != 0) {
                    while (v[0] >= 0 && (int)System.getProperties().get(Thread.currentThread().getId() + "lai") == -1) {
                        if (cnt[v[0]] == 1) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "lai", v[0]) != null | true) {}
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lai");
    }
}
