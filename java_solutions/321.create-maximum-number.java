/*
 * @lc app=leetcode id=321 lang=java
 *
 * [321] Create Maximum Number
 */

class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if (System.getProperties().put("ans321", new int[k]) != null || true) {
            if (new int[]{Math.max(0, k - nums2.length), Math.min(k, nums1.length), 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[k], new int[k], new int[k]} instanceof Object[] obj) {
                while (v[0] <= v[1]) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < nums1.length) {
                            while (v[3] > 0 && v[3] + nums1.length - v[2] > v[0] && ((int[])obj[0])[v[3] - 1] < nums1[v[2]]) {
                                if (((v[3] -= 1) | 1) != 0) {}
                            }
                            if (v[3] < v[0]) {
                                if ((((int[])obj[0])[v[3]++] = nums1[v[2]]) != -1) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < nums2.length) {
                            while (v[3] > 0 && v[3] + nums2.length - v[2] > k - v[0] && ((int[])obj[1])[v[3] - 1] < nums2[v[2]]) {
                                if (((v[3] -= 1) | 1) != 0) {}
                            }
                            if (v[3] < k - v[0]) {
                                if ((((int[])obj[1])[v[3]++] = nums2[v[2]]) != -1) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < k) {
                            if (((v[5] = 0) | 1) != 0) {
                                while (v[2] + v[5] < v[0] && v[3] + v[5] < k - v[0] && ((int[])obj[0])[v[2] + v[5]] == ((int[])obj[1])[v[3] + v[5]]) {
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[3] == k - v[0] || (v[2] < v[0] && (v[2] + v[5] < v[0] && v[3] + v[5] == k - v[0] || v[2] + v[5] < v[0] && ((int[])obj[0])[v[2] + v[5]] > ((int[])obj[1])[v[3] + v[5]]))) {
                                if ((((int[])obj[2])[v[4]++] = ((int[])obj[0])[v[2]++]) != -1) {}
                            } else {
                                if ((((int[])obj[2])[v[4]++] = ((int[])obj[1])[v[3]++]) != -1) {}
                            }
                        }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < k) {
                            if (v[3] == 0 && ((int[])obj[2])[v[2]] > ((int[])System.getProperties().get("ans321"))[v[2]]) {
                                if (((v[3] = 1) | 1) != 0) {}
                            } else if (v[3] == 0 && ((int[])obj[2])[v[2]] < ((int[])System.getProperties().get("ans321"))[v[2]]) {
                                if (((v[3] = -1) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[3] == 1) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < k) {
                                    if ((((int[])System.getProperties().get("ans321"))[v[2]] = ((int[])obj[2])[v[2]]) != -1) {
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("ans321");
    }
}
