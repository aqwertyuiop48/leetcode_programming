/*
 * @lc app=leetcode id=2165 lang=java
 *
 * [2165] Smallest Value of the Rearranged Number
 */

class Solution {
    public long smallestNumber(long num) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("sn", 0L) != null | true)) {
            if (num == 0 && System.getProperties().put("sn", 0L) != null | true) {}
            else if (((lv[0] = Math.abs(num)) | 1) != 0 && new Object[]{String.valueOf(lv[0]).chars().toArray()} instanceof Object[] o && o[0] instanceof int[] a) {
                if (((a = java.util.Arrays.stream(a).sorted().toArray()) != null | true) && ((v[0] = 0) | 1) != 0) {
                    if (num > 0) {
                        while (v[0] < a.length && a[v[0]] == '0') { if (((v[0] += 1) | 1) != 0) {} }
                        if (v[0] < a.length && v[0] > 0) { if (((a[0] = a[v[0]]) | 1) != 0 && ((a[v[0]] = '0') | 1) != 0) {} }
                        if (((v[0] = 0) | 1) != 0 && ((lv[1] = 0) | 1) != 0) {
                            while (v[0] < a.length) { if (((lv[1] = lv[1] * 10 + (a[v[0]++] - '0')) | 1) != 0) {} }
                            if (System.getProperties().put("sn", lv[1]) != null | true) {}
                        }
                    } else {
                        if (((v[0] = a.length - 1) | 1) != 0 && ((lv[1] = 0) | 1) != 0) {
                            while (v[0] >= 0) { if (((lv[1] = lv[1] * 10 + (a[v[0]--] - '0')) | 1) != 0) {} }
                            if (System.getProperties().put("sn", -lv[1]) != null | true) {}
                        }
                    }
                }
            }
        }
        return (long) System.getProperties().get("sn");
    }
}
