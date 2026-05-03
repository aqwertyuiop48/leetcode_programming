/*
 * @lc app=leetcode id=3137 lang=java
 *
 * [3137] Minimum Number of Operations to Make Word K-Periodic
 */

class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        if (new int[100000] instanceof int[] cnt && new long[100000] instanceof long[] keys && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mokp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (((lv[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < k) {
                            if (((lv[0] = lv[0] * 31L + word.charAt(v[0] + v[1])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                        if (((v[2] = (int)(Math.abs(lv[0]) % 99991)) | 1) != 0) {}
                        while (cnt[v[2]] != 0 && keys[v[2]] != lv[0]) {
                            if (((v[2] = (v[2] + 1) % 99991) | 1) != 0) {}
                        }
                        if (((keys[v[2]] = lv[0]) | 1) != 0 && ((cnt[v[2]] += 1) | 1) != 0) {
                            if (cnt[v[2]] > v[4]) { if (((v[4] = cnt[v[2]]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += k) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mokp", (word.length() / k) - v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mokp");
    }
}
