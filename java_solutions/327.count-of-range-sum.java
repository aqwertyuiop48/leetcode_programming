/*
 * @lc app=leetcode id=327 lang=java
 *
 * [327] Count of Range Sum
 */

class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (new int[]{0, nums.length, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new long[nums.length + 1], null, null} instanceof Object[] obj) {
            while (v[0] < v[1]) {
                if (((((long[])obj[0])[v[0] + 1] = ((long[])obj[0])[v[0]] + nums[v[0]]) | 1) != 0) {
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((obj[1] = new long[(v[1] + 1) * 3]) != null || true) && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((((long[])obj[1])[v[0] * 3] = ((long[])obj[0])[v[0]]) | 1) != 0 && (((((long[])obj[1])[v[0] * 3 + 1] = ((long[])obj[0])[v[0]] - lower) | 1) != 0) && (((((long[])obj[1])[v[0] * 3 + 2] = ((long[])obj[0])[v[0]] - upper) | 1) != 0)) {
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            if (((obj[1] = Arrays.stream((long[])obj[1]).sorted().distinct().toArray()) != null || true) && ((obj[2] = new int[((long[])obj[1]).length + 1]) != null || true) && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[10] = Arrays.binarySearch((long[])obj[1], ((long[])obj[0])[v[0]] - upper)) | 1) != 0 && ((v[2] = v[10] >= 0 ? v[10] : ~v[10]) | 1) != 0) {
                        if (((v[10] = Arrays.binarySearch((long[])obj[1], ((long[])obj[0])[v[0]] - lower)) | 1) != 0 && ((v[3] = v[10] >= 0 ? v[10] + 1 : ~v[10]) | 1) != 0) {
                            while (v[3] > 0) {
                                if (((v[4] += ((int[])obj[2])[v[3]]) | 1) != 0 && ((v[3] -= v[3] & -v[3]) | 1) != 0) {}
                            }
                            while (v[2] > 0) {
                                if (((v[4] -= ((int[])obj[2])[v[2]]) | 1) != 0 && ((v[2] -= v[2] & -v[2]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[10] = Arrays.binarySearch((long[])obj[1], ((long[])obj[0])[v[0]])) | 1) != 0 && ((v[3] = v[10] >= 0 ? v[10] + 1 : ~v[10] + 1) | 1) != 0) {
                        while (v[3] > 0 && v[3] < ((int[])obj[2]).length) {
                            if ((((int[])obj[2])[v[3]] += 1) != -1 && ((v[3] += v[3] & -v[3]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((lower = v[4]) | 1) != 0) {}
        }
        return lower;
    }
}
