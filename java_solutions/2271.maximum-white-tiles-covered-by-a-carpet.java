/*
 * @lc app=leetcode id=2271 lang=java
 *
 * [2271] Maximum White Tiles Covered by a Carpet
 */

class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mwt", 0) != null | true) && (tiles = java.util.Arrays.stream(tiles).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
            while (v[1] < tiles.length && v[3] < carpetLen) {
                if (tiles[v[0]][0] + carpetLen > tiles[v[1]][1]) {
                    if (((v[2] += tiles[v[1]][1] - tiles[v[1]][0] + 1) | 1) != 0 && v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                } else {
                    if (((v[4] = Math.max(0, tiles[v[0]][0] + carpetLen - tiles[v[1]][0])) | 1) != 0 && v[2] + v[4] > v[3]) { if (((v[3] = v[2] + v[4]) | 1) != 0) {} }
                    if (v[3] >= carpetLen) { if (((v[3] = carpetLen) | 1) != 0 && ((v[1] = tiles.length) | 1) != 0) {} }
                    else { if (((v[2] -= tiles[v[0]][1] - tiles[v[0]][0] + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mwt", v[3]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mwt");
    }
}
