/*
 * @lc app=leetcode id=3185 lang=java
 *
 * [3185] Count Pairs That Form a Complete Day II
 */

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        if (new long[25] instanceof long[] cnt && new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ccdp2", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < hours.length) {
                    if (((v[2] = hours[(int)v[0]] % 24) | 1) != 0 && ((v[3] = (24 - v[2]) % 24) | 1) != 0) {
                        if (((v[1] += cnt[(int)v[3]]) | 1) != 0 && ((cnt[(int)v[2]] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ccdp2", v[1]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ccdp2");
    }
}
