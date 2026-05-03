/*
 * @lc app=leetcode id=3394 lang=java
 *
 * [3394] Check if Grid can be Cut into Sections
 */

class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cvc", false) != null | true)) {
            if ((rectangles = java.util.Arrays.stream(rectangles).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && ((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = rectangles[0][2]) | 1) != 0) {
                while (v[0] < rectangles.length) {
                    if (rectangles[v[0]][0] >= v[2]) { if (((v[1] += 1) | 1) != 0 && ((v[2] = rectangles[v[0]][2]) | 1) != 0) {} }
                    else if (rectangles[v[0]][2] > v[2]) { if (((v[2] = rectangles[v[0]][2]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] >= 3) { if (System.getProperties().put(Thread.currentThread().getId() + "cvc", true) != null | true) {} }
            }
            if ((rectangles = java.util.Arrays.stream(rectangles).sorted((a, b) -> Integer.compare(a[1], b[1])).toArray(int[][]::new)) != null && ((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = rectangles[0][3]) | 1) != 0) {
                while (v[0] < rectangles.length) {
                    if (rectangles[v[0]][1] >= v[2]) { if (((v[1] += 1) | 1) != 0 && ((v[2] = rectangles[v[0]][3]) | 1) != 0) {} }
                    else if (rectangles[v[0]][3] > v[2]) { if (((v[2] = rectangles[v[0]][3]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] >= 3) { if (System.getProperties().put(Thread.currentThread().getId() + "cvc", true) != null | true) {} }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cvc");
    }
}
