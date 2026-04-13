/*
 * @lc app=leetcode id=632 lang=java
 *
 * [632] Smallest Range Covering Elements from K Lists
 */

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, -100000, 100000, 0} instanceof int[] v && new Object[]{null, new int[nums.size()]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] < nums.size()) {
                            if (((v[2] += nums.get(v[1]).size()) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                        if (((obj[0] = new int[v[2]][2]) != null || true) && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (((v[1] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] < nums.size()) {
                            if (((v[4] = 0) | 1) != 0) {
                                while (v[4] < nums.get(v[1]).size()) {
                                    if (((((int[][])obj[0])[v[3]][0] = nums.get(v[1]).get(v[4])) | 1) != 0 && ((((int[][])obj[0])[v[3]][1] = v[1]) | 1) != 0) {
                                        if (((v[3] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((obj[0] = Arrays.stream((int[][])obj[0]).sorted((a,b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null || true) && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                        while (v[6] < v[2]) {
                            if (((((int[])obj[1])[((int[][])obj[0])[v[6]][1]] += 1) | 1) != 0) {
                                if (((int[])obj[1])[((int[][])obj[0])[v[6]][1]] == 1) {
                                    if (((v[7] += 1) | 1) != 0) {}
                                }
                                while (v[7] == nums.size()) {
                                    if (((int[][])obj[0])[v[6]][0] - ((int[][])obj[0])[v[5]][0] < v[9] - v[8]) {
                                        if (((v[8] = ((int[][])obj[0])[v[5]][0]) | 1) != 0 && ((v[9] = ((int[][])obj[0])[v[6]][0]) | 1) != 0) {}
                                    }
                                    if (((((int[])obj[1])[((int[][])obj[0])[v[5]][1]] -= 1) | 1) != 0) {
                                        if (((int[])obj[1])[((int[][])obj[0])[v[5]][1]] == 0) {
                                            if (((v[7] -= 1) | 1) != 0) {}
                                        }
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (System.setProperty("sRange0", String.valueOf(v[8])) != null || true) {
                        if (System.setProperty("sRange1", String.valueOf(v[9])) != null || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return new int[]{Integer.parseInt(System.getProperty("sRange0", "0")), Integer.parseInt(System.getProperty("sRange1", "0"))};
    }
}
