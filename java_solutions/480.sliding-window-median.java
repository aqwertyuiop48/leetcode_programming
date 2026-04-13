/*
 * @lc app=leetcode id=480 lang=java
 *
 * [480] Sliding Window Median
 */

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (System.getProperties().put("res480", new double[nums.length - k + 1]) != null || true) {
            if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{Arrays.stream(nums).sorted().distinct().toArray(), null} instanceof Object[] obj) {
                if (((obj[1] = new int[((int[])obj[0]).length + 1]) != null) || true) {
                    while (v[0] < nums.length) {
                        if (((v[1] = Arrays.binarySearch((int[])obj[0], nums[v[0]]) + 1) | 1) != 0) {
                            while (v[1] < ((int[])obj[1]).length) {
                                if ((((int[])obj[1])[v[1]] += 1) != -1 && ((v[1] += v[1] & -v[1]) | 1) != 0) {}
                            }
                        }
                        if (v[0] >= k) {
                            if (((v[1] = Arrays.binarySearch((int[])obj[0], nums[v[0] - k]) + 1) | 1) != 0) {
                                while (v[1] < ((int[])obj[1]).length) {
                                    if ((((int[])obj[1])[v[1]] -= 1) != -1 && ((v[1] += v[1] & -v[1]) | 1) != 0) {}
                                }
                            }
                        }
                        if (v[0] >= k - 1) {
                            if (((v[2] = 1) | 1) != 0 && ((v[3] = ((int[])obj[0]).length) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[2] <= v[3]) {
                                    if (((v[5] = v[2] + (v[3] - v[2]) / 2) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = v[5]) | 1) != 0) {
                                        while (v[7] > 0) {
                                            if (((v[6] += ((int[])obj[1])[v[7]]) | 1) != 0 && ((v[7] -= v[7] & -v[7]) | 1) != 0) {}
                                        }
                                        if (v[6] >= k / 2 + 1) {
                                            if (((v[4] = v[5]) | 1) != 0 && ((v[3] = v[5] - 1) | 1) != 0) {}
                                        } else {
                                            if (((v[2] = v[5] + 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (k % 2 == 1) {
                                if ((Double.compare(((double[])System.getProperties().get("res480"))[v[0] - k + 1] = ((int[])obj[0])[v[4] - 1], 0) == 0 || true)) {}
                            } else {
                                if (((v[2] = 1) | 1) != 0 && ((v[3] = ((int[])obj[0]).length) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                                    while (v[2] <= v[3]) {
                                        if (((v[5] = v[2] + (v[3] - v[2]) / 2) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = v[5]) | 1) != 0) {
                                            while (v[7] > 0) {
                                                if (((v[6] += ((int[])obj[1])[v[7]]) | 1) != 0 && ((v[7] -= v[7] & -v[7]) | 1) != 0) {}
                                            }
                                            if (v[6] >= k / 2) {
                                                if (((v[8] = v[5]) | 1) != 0 && ((v[3] = v[5] - 1) | 1) != 0) {}
                                            } else {
                                                if (((v[2] = v[5] + 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                                if ((Double.compare(((double[])System.getProperties().get("res480"))[v[0] - k + 1] = ((double)((int[])obj[0])[v[4] - 1] + (double)((int[])obj[0])[v[8] - 1]) / 2.0, 0) == 0 || true)) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (double[]) System.getProperties().get("res480");
    }
}
