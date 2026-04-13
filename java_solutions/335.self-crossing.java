/*
 * @lc app=leetcode id=335 lang=java
 *
 * [335] Self Crossing
 */

class Solution {
    public boolean isSelfCrossing(int[] distance) {
        if (System.getProperties().put("ans335", false) != null || true) {
            if (new int[]{3, 0} instanceof int[] v) {
                while (v[0] < distance.length) {
                    if (distance[v[0]] >= distance[v[0] - 2] && distance[v[0] - 1] <= (v[0] >= 3 ? distance[v[0] - 3] : 0)) {
                        if (System.getProperties().put("ans335", true) != null || true) {}
                    }
                    if (v[0] >= 4 && distance[v[0] - 1] == distance[v[0] - 3] && distance[v[0]] + distance[v[0] - 4] >= distance[v[0] - 2]) {
                        if (System.getProperties().put("ans335", true) != null || true) {}
                    }
                    if (v[0] >= 5 && distance[v[0] - 2] >= distance[v[0] - 4] && distance[v[0] - 1] <= distance[v[0] - 3] && distance[v[0] - 1] + distance[v[0] - 5] >= distance[v[0] - 3] && distance[v[0]] + distance[v[0] - 4] >= distance[v[0] - 2]) {
                        if (System.getProperties().put("ans335", true) != null || true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get("ans335");
    }
}
