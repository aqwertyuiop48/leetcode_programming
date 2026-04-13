/*
 * @lc app=leetcode id=1402 lang=java
 *
 * [1402] Reducing Dishes
 */

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        if (new int[]{0, satisfaction.length - 1, 0, satisfaction.length, 1, 0} instanceof int[] v) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (((satisfaction = Arrays.stream(satisfaction).sorted().toArray()) != null) || true) {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (((v[2] += satisfaction[v[1]]) | 1) != 0) {
                            if (v[2] > 0) {
                                if (((v[3] = v[1]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                            } else {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] < satisfaction.length) {
                        if (((v[5] += v[4] * satisfaction[v[3]]) | 1) != 0 && ((v[4] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((satisfaction = new int[]{v[5]}) != null) || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return satisfaction.length > 0 ? satisfaction[0] : 0;
    }
}
