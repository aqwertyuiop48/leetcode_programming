/*
 * @lc app=leetcode id=3371 lang=java
 *
 * [3371] Identify the Largest Outlier in an Array
 */

class Solution {
    public int getLargestOutlier(int[] nums) {
        if (new int[2005] instanceof int[] pCnt && new int[2005] instanceof int[] nCnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "glo", -9999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[v[0]]) | 1) != 0) {
                        if (nums[v[0]] >= 0) { if (((pCnt[nums[v[0]]] += 1) | 1) != 0) {} }
                        else { if (((nCnt[-nums[v[0]]] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[4] = -9999999) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[2] = v[1] - nums[v[0]]) | 1) != 0) {
                            if (v[2] % 2 == 0) {
                                if (((v[3] = v[2] / 2) | 1) != 0) {
                                    if (nums[v[0]] == v[3]) {
                                        if ((v[3] >= 0 && pCnt[v[3]] > 1) || (v[3] < 0 && nCnt[-v[3]] > 1)) {
                                            if (nums[v[0]] > v[4]) { if (((v[4] = nums[v[0]]) | 1) != 0) {} }
                                        }
                                    } else {
                                        if ((v[3] >= 0 && v[3] <= 1000 && pCnt[v[3]] > 0) || (v[3] < 0 && -v[3] <= 1000 && nCnt[-v[3]] > 0)) {
                                            if (nums[v[0]] > v[4]) { if (((v[4] = nums[v[0]]) | 1) != 0) {} }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "glo", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "glo");
    }
}
