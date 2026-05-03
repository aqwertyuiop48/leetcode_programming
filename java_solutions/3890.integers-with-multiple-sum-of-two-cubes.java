/*
 * @lc app=leetcode id=3890 lang=java
 *
 * [3890] Integers With Multiple Sum of Two Cubes
 */

class Solution {
    public java.util.List<Integer> findGoodIntegers(int n) {
        if (new int[1000005] instanceof int[] sums && new int[10] instanceof int[] v && (System.getProperties().put("gi", new java.util.ArrayList<Integer>()) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while ((long)v[0] * v[0] * v[0] <= n) {
                    if (((v[1] = v[0]) | 1) != 0) {
                        while ((long)v[0] * v[0] * v[0] + (long)v[1] * v[1] * v[1] <= n) {
                            if (((sums[v[3]++] = v[0] * v[0] * v[0] + v[1] * v[1] * v[1]) | 1) != 0) {}
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new Object(){boolean s(){java.util.Arrays.sort(sums, 0, v[3]); return true;}}.s() && ((v[0] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[0] < v[3]) {
                        if (sums[v[0]] == sums[v[0] - 1] && v[4] != sums[v[0]]) {
                            if (System.getProperties().get("gi") instanceof java.util.List ans && ans.add(sums[v[0]]) | true && ((v[4] = sums[v[0]]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("gi");
    }
}
