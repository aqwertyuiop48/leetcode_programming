/*
 * @lc app=leetcode id=1033 lang=java
 *
 * [1033] Moving Stones Until Consecutive
 */

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        if (new int[]{a, b, c} instanceof int[] arr && new int[2] instanceof int[] ans && (System.getProperties().put("msu", ans) != null | true)) {
            if (((arr = java.util.Arrays.stream(arr).sorted().toArray()) != null | true) && ((ans[1] = arr[2] - arr[0] - 2) | 1) != 0) {
                if (arr[2] - arr[1] == 1 && arr[1] - arr[0] == 1) {
                    if (((ans[0] = 0) | 1) != 0) {}
                } else if (arr[2] - arr[1] <= 2 || arr[1] - arr[0] <= 2) {
                    if (((ans[0] = 1) | 1) != 0) {}
                } else {
                    if (((ans[0] = 2) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("msu");
    }
}
