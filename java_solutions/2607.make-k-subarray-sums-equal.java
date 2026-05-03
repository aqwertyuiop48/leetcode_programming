/*
 * @lc app=leetcode id=2607 lang=java
 *
 * [2607] Make K-Subarray Sums Equal
 */

class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mk", 0L) != null | true) && ((v[0] = arr.length) | 1) != 0 && ((v[1] = k) | 1) != 0) {
            while (v[1] != 0) { if (((v[2] = v[1]) | 1) != 0 && ((v[1] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[2]) | 1) != 0) {} }
            if (new boolean[arr.length] instanceof boolean[] vis && ((v[3] = 0) | 1) != 0) {
                while (v[3] < arr.length) {
                    if (!vis[(int)v[3]]) {
                        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList cycle && ((v[4] = v[3]) | 1) != 0) {
                            while (!vis[(int)v[4]]) { if (((vis[(int)v[4]] = true) | true) && cycle.add(arr[(int)v[4]]) | true && ((v[4] = (v[4] + v[0]) % arr.length) | 1) != 0) {} }
                            if ((System.getProperties().put("s", cycle.stream().sorted().toArray()) != null | true) && ((v[5] = (int)((Object[])System.getProperties().get("s"))[cycle.size() / 2]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                while (v[6] < cycle.size()) { if (((v[7] += Math.abs((int)((Object[])System.getProperties().get("s"))[(int)v[6]] - v[5])) | 1) != 0 && ((v[6] += 1) | 1) != 0) {} }
                            }
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mk", v[7]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mk");
    }
}
