/*
 * @lc app=leetcode id=3265 lang=java
 *
 * [3265] Count Almost Equal Pairs I
 */

class Solution {
    public int countPairs(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cep", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (nums[v[0]] == nums[v[1]]) { if (((v[2] += 1) | 1) != 0) {} }
                            else {
                                if (new int[10] instanceof int[] d1 && new int[10] instanceof int[] d2 && ((v[3] = nums[v[0]]) | 1) != 0 && ((v[4] = nums[v[1]]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                    while (v[3] > 0 || v[4] > 0) {
                                        if (v[3] % 10 != v[4] % 10) {
                                            if (((d1[v[5]] = v[3] % 10) | 1) != 0 && ((d2[v[5]++] = v[4] % 10) | 1) != 0) {}
                                        }
                                        if (((v[3] /= 10) | 1) != 0 && ((v[4] /= 10) | 1) != 0) {}
                                    }
                                    if (v[5] == 2 && d1[0] == d2[1] && d1[1] == d2[0]) { if (((v[2] += 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cep", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cep");
    }
}
