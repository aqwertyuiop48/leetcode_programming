/*
 * @lc app=leetcode id=2332 lang=java
 *
 * [2332] The Latest Time to Catch a Bus
 */

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        if (new Object[]{java.util.Arrays.stream(buses).sorted().toArray(), java.util.Arrays.stream(passengers).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] b && o[1] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("ltb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < b.length) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < capacity && v[1] < p.length && p[v[1]] <= b[v[0]]) { if (((v[2] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[3] = (v[2] < capacity ? b[b.length - 1] : p[v[1] - 1])) | 1) != 0 && ((v[4] = v[1] - 1) | 1) != 0) {
                    while (v[4] >= 0 && p[v[4]] == v[3]) { if (((v[3] -= 1) | 1) != 0 && ((v[4] -= 1) | 1) != 0) {} }
                    if (System.getProperties().put("ltb", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("ltb");
    }
}
