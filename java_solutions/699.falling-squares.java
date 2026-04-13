/*
 * @lc app=leetcode id=699 lang=java
 *
 * [699] Falling Squares
 */

class Solution {
    public List<Integer> fallingSquares(int[][] positions) {
        if (System.getProperties().put("ans699", new ArrayList<Integer>()) != null || true) {
            if (new int[]{0, 0, 0, 0, positions.length, 0} instanceof int[] v && new int[positions.length] instanceof int[] dp && System.getProperties().get("ans699") instanceof List list) {
                while (v[0] < v[4]) {
                    if (((v[1] = positions[v[0]][0]) | 1) != 0 && ((v[2] = positions[v[0]][1]) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[5] < v[0]) {
                            if (Math.max(v[1], positions[v[5]][0]) < Math.min(v[1] + v[2], positions[v[5]][0] + positions[v[5]][1])) {
                                if (((v[3] = Math.max(v[3], dp[v[5]])) | 1) != 0) {}
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                        if (((dp[v[0]] = v[3] + v[2]) | 1) != 0) {
                            if (list.add(v[0] == 0 ? dp[0] : Math.max((Integer)list.get(v[0] - 1), dp[v[0]])) || true) {
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (List<Integer>) System.getProperties().get("ans699");
    }
}
