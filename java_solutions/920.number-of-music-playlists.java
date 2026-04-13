/*
 * @lc app=leetcode id=920 lang=java
 *
 * [920] Number of Music Playlists
 */

class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        if (new Object[]{new long[goal + 1][n + 1], new int[]{0, 0, n, goal, k}} instanceof Object[] v) {
            if (((((long[][])v[0])[0][0] = 1) | 1) != 0 && ((((int[])v[1])[0] = 1) | 1) != 0) {}
            while (((int[])v[1])[0] <= goal) {
                if (((((int[])v[1])[1] = 1) | 1) != 0) {}
                while (((int[])v[1])[1] <= n) {
                    if (((((long[][])v[0])[((int[])v[1])[0]][((int[])v[1])[1]] = (((long[][])v[0])[((int[])v[1])[0] - 1][((int[])v[1])[1] - 1] * (n - ((int[])v[1])[1] + 1)) % 1000000007L) | 1) != 0) {}
                    if (((int[])v[1])[1] > k) {
                        if (((((long[][])v[0])[((int[])v[1])[0]][((int[])v[1])[1]] = (((long[][])v[0])[((int[])v[1])[0]][((int[])v[1])[1]] + (((long[][])v[0])[((int[])v[1])[0] - 1][((int[])v[1])[1]] * (((int[])v[1])[1] - k)) % 1000000007L) % 1000000007L) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("numMusic", (int) ((long[][])v[0])[goal][n]) != null || true) {}
        }
        return (int) System.getProperties().get("numMusic");
    }
}
