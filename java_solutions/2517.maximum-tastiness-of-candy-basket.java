/*
 * @lc app=leetcode id=2517 lang=java
 *
 * [2517] Maximum Tastiness of Candy Basket
 */

class Solution {
    public int maximumTastiness(int[] price, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mtc", 0) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(price).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] p) {
                if (((v[0] = 0) | 1) != 0 && ((v[1] = p[p.length - 1] - p[0]) | 1) != 0) {
                    while (v[0] <= v[1]) {
                        if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = p[0]) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                            while (v[5] < p.length) {
                                if (p[v[5]] - v[4] >= v[2]) { if (((v[3] += 1) | 1) != 0 && ((v[4] = p[v[5]]) | 1) != 0) {} }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                            if (v[3] >= k) { if (System.getProperties().put("mtc", v[2]) != null | true && ((v[0] = v[2] + 1) | 1) != 0) {} }
                            else { if (((v[1] = v[2] - 1) | 1) != 0) {} }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mtc");
    }
}
