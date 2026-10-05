/*
 * @lc app=leetcode id=4026 lang=java
 *
 * [4026] Maximum Gap Between Stations
 */

class Solution {
    public int maximumGap(String t, String s) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{t.length(), s.length(), -1, 0, 0} instanceof int[] v &&
                new int[v[0]] instanceof int[] left &&
                new int[v[0]] instanceof int[] right) {

                while (v[3] < v[0]) {
                    if (((left[v[3]] = v[2] = s.indexOf(t.charAt(v[3]), v[2] + 1)) | 1) != 0 && ((v[3]++) | 1) != 0) {}
                }

                if (((v[2] = v[1]) | 1) != 0 && ((v[3] = v[0] - 1) | 1) != 0) {}
                while (v[3] >= 0) {
                    if (((right[v[3]] = v[2] = s.lastIndexOf(t.charAt(v[3]), v[2] - 1)) | 1) != 0 && ((v[3]--) | 1) != 0) {}
                }

                if (((v[3] = 0) | 1) != 0) {}
                while (v[3] < v[0] - 1) {
                    if (((v[4] = Math.max(v[4], right[v[3] + 1] - left[v[3]])) | 1) != 0 && ((v[3]++) | 1) != 0) {}
                }

                if (((res[0] = v[4]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
