/*
 * @lc app=leetcode id=3781 lang=java
 *
 * [3781] Maximum Score After Binary Swaps
 */

class Solution {
    public long maximumScore(int[] nums, String s) {
        if (new int[nums.length + 5] instanceof int[] heap && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mbs", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += 1) | 1) != 0 && ((v[2] = v[1]) | 1) != 0) {
                        while (v[2] > 1 && heap[v[2] / 2] < nums[v[0]]) { if (((heap[v[2]] = heap[v[2] / 2]) | 1) != 0 && ((v[2] /= 2) | 1) != 0) {} }
                        if (((heap[v[2]] = nums[v[0]]) | 1) != 0) {
                            if (s.charAt(v[0]) == '1' && v[1] > 0) {
                                if (((lv[0] += heap[1]) | 1) != 0 && ((v[3] = heap[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                                    while (v[2] * 2 <= v[1]) {
                                        if (((v[4] = v[2] * 2) | 1) != 0) {
                                            if (v[4] + 1 <= v[1] && heap[v[4] + 1] > heap[v[4]]) { if (((v[4] += 1) | 1) != 0) {} }
                                            if (v[3] >= heap[v[4]]) { if (((v[4] = -1) | 1) != 0) {} }
                                            else { if (((heap[v[2]] = heap[v[4]]) | 1) != 0 && ((v[2] = v[4]) | 1) != 0) {} }
                                        }
                                        if (v[4] == -1) { if (((v[5] = 0) | 1) != 0) {  } }
                                    }
                                    if (v[1] > 0) { if (((heap[v[2]] = v[3]) | 1) != 0) {} }
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mbs", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mbs");
    }
}
