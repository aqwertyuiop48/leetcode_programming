/*
 * @lc app=leetcode id=3296 lang=java
 *
 * [3296] Minimum Number of Seconds to Make Mountain Height Zero
 */

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mns", 0L) != null | true)) {
            if (((lv[0] = 0L) | 1) != 0 && ((lv[1] = 100000000000000000L) | 1) != 0) {
                while (lv[0] <= lv[1]) {
                    if (((lv[2] = lv[0] + (lv[1] - lv[0]) / 2L) | 1) != 0 && ((lv[3] = 0L) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                        while (v[0] < workerTimes.length) {
                            if (((lv[4] = (long)(Math.sqrt(1.0 + 8.0 * lv[2] / workerTimes[v[0]]) - 1.0) / 2L) | 1) != 0 && ((lv[3] += lv[4]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                        if (lv[3] >= mountainHeight) {
                            if (((lv[5] = lv[2]) | 1) != 0 && ((lv[1] = lv[2] - 1L) | 1) != 0) {}
                        } else {
                            if (((lv[0] = lv[2] + 1L) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mns", lv[5]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mns");
    }
}
