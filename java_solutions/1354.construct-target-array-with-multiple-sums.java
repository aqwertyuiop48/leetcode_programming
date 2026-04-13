/*
 * @lc app=leetcode id=1354 lang=java
 *
 * [1354] Construct Target Array With Multiple Sums
 */

class Solution {
    public boolean isPossible(int[] target) {
        if (new long[]{0, 0, 0, 0, 0, 0, 0} instanceof long[] v && new Object[]{new PriorityQueue<Long>((a, b) -> Long.compare(b, a))} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] < target.length) {
                        if ((((PriorityQueue<Long>)obj[0]).add((long)target[(int)v[1]])) || true) {
                            if (((v[2] += target[(int)v[1]]) | 1) != 0) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[2] > 0 && !((PriorityQueue<Long>)obj[0]).isEmpty() && ((PriorityQueue<Long>)obj[0]).peek() > 1) {
                        if (((v[3] = ((PriorityQueue<Long>)obj[0]).poll()) | 1) != 0) {
                            if (((v[4] = v[2] - v[3]) | 1) != 0) {
                                if (v[4] == 1) {
                                    if (((target[0] = 1) | 1) != 0) {
                                        if (((v[0] = 5) | 1) != 0) {}
                                    }
                                } else if (v[4] == 0 || v[3] <= v[4] || v[3] % v[4] == 0) {
                                    if (((target[0] = 0) | 1) != 0) {
                                        if (((v[0] = 5) | 1) != 0) {}
                                    }
                                } else {
                                    if (((v[5] = v[3] % v[4]) | 1) != 0) {
                                        if (((v[2] = v[2] - v[3] + v[5]) | 1) != 0) {
                                            if ((((PriorityQueue<Long>)obj[0]).add(v[5])) || true) {}
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (((target[0] = 1) | 1) != 0) {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return target[0] == 1;
    }
}
