/*
 * @lc app=leetcode id=3780 lang=java
 *
 * [3780] Maximum Sum of Three Numbers Divisible by Three
 */

class Solution {
    public int maximumSum(int[] nums) {
        if (new int[9] instanceof int[] m && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms3", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 9) { if (((m[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = v[1] % 3) | 1) != 0) {
                            if (v[2] == 0) {
                                if (v[1] > m[0]) { if (((m[2] = m[1]) | 1) != 0 && ((m[1] = m[0]) | 1) != 0 && ((m[0] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[1]) { if (((m[2] = m[1]) | 1) != 0 && ((m[1] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[2]) { if (((m[2] = v[1]) | 1) != 0) {} }
                            } else if (v[2] == 1) {
                                if (v[1] > m[3]) { if (((m[5] = m[4]) | 1) != 0 && ((m[4] = m[3]) | 1) != 0 && ((m[3] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[4]) { if (((m[5] = m[4]) | 1) != 0 && ((m[4] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[5]) { if (((m[5] = v[1]) | 1) != 0) {} }
                            } else {
                                if (v[1] > m[6]) { if (((m[8] = m[7]) | 1) != 0 && ((m[7] = m[6]) | 1) != 0 && ((m[6] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[7]) { if (((m[8] = m[7]) | 1) != 0 && ((m[7] = v[1]) | 1) != 0) {} }
                                else if (v[1] > m[8]) { if (((m[8] = v[1]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        if (m[0] != -1 && m[1] != -1 && m[2] != -1 && m[0] + m[1] + m[2] > v[0]) { if (((v[0] = m[0] + m[1] + m[2]) | 1) != 0) {} }
                        if (m[3] != -1 && m[4] != -1 && m[5] != -1 && m[3] + m[4] + m[5] > v[0]) { if (((v[0] = m[3] + m[4] + m[5]) | 1) != 0) {} }
                        if (m[6] != -1 && m[7] != -1 && m[8] != -1 && m[6] + m[7] + m[8] > v[0]) { if (((v[0] = m[6] + m[7] + m[8]) | 1) != 0) {} }
                        if (m[0] != -1 && m[3] != -1 && m[6] != -1 && m[0] + m[3] + m[6] > v[0]) { if (((v[0] = m[0] + m[3] + m[6]) | 1) != 0) {} }
                        if (System.getProperties().put(Thread.currentThread().getId() + "ms3", v[0]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ms3");
    }
}
