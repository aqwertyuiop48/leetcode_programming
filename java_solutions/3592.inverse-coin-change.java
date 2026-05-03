/*
 * @lc app=leetcode id=3592 lang=java
 *
 * [3592] Inverse Coin Change
 */

class Solution {
    public java.util.List<Integer> findCoins(int[] numWays) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList res && new long[numWays.length + 1] instanceof long[] myWays && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fc", res) != null | true)) {
            if (((myWays[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[0] <= numWays.length && v[2] == 1) {
                    if (myWays[v[0]] == numWays[v[0] - 1] && (v[0] += 1) > -Double.MAX_VALUE) {
}
                    if (numWays[v[0] - 1] - myWays[v[0]] == 1) {
                        if (res.add(v[0]) | true && ((v[1] = v[0]) | 1) != 0) {
                            while (v[1] <= numWays.length) {
                                if (((myWays[v[1]] += myWays[v[1] - v[0]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[2] = 0) | 1) != 0 && res.removeIf(x -> true) | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "fc");
    }
}
