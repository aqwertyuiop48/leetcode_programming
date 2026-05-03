/*
 * @lc app=leetcode id=3623 lang=java
 *
 * [3623] Count Number of Trapezoids I
 */

class Solution {
    public int countTrapezoids(int[][] points) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "cnt", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < points.length) {
                if (map.put(points[v[0]][1], (int)map.getOrDefault(points[v[0]][1], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                if (map.values().iterator() instanceof java.util.Iterator it) {
                    while (it.hasNext()) {
                        if (((v[3] = (int)it.next()) | 1) != 0 && ((v[4] = (int)(((long)v[3] * (v[3] - 1) / 2) % 1000000007)) | 1) != 0) {
                            if (((v[1] = (v[1] + v[4]) % 1000000007) | 1) != 0 && ((v[2] = (int)((v[2] + (long)v[4] * v[4]) % 1000000007)) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cnt", (int)((((long)v[1] * v[1] % 1000000007) - v[2] + 1000000007) % 1000000007 * 500000004 % 1000000007)) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cnt");
    }
}
