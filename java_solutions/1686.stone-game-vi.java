/*
 * @lc app=leetcode id=1686 lang=java
 *
 * [1686] Stone Game VI
 */

class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        if (new int[aliceValues.length][3] instanceof int[][] arr && new int[10] instanceof int[] v && (System.getProperties().put("sg6", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < aliceValues.length) {
                    if (((arr[v[0]][0] = aliceValues[v[0]] + bobValues[v[0]]) | 1) != 0 && ((arr[v[0]][1] = aliceValues[v[0]]) | 1) != 0 && ((arr[v[0]][2] = bobValues[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((arr = java.util.Arrays.stream(arr).sorted((a, b) -> b[0] - a[0]).toArray(int[][]::new)) != null | true) && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < arr.length) {
                        if (v[0] % 2 == 0) { if (((v[1] += arr[v[0]][1]) | 1) != 0) {} }
                        else { if (((v[2] += arr[v[0]][2]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("sg6", Integer.compare(v[1], v[2])) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("sg6");
    }
}
