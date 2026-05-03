/*
 * @lc app=leetcode id=3335 lang=java
 *
 * [3335] Total Characters in String After Transformations I
 */

class Solution {
    public int lengthAfterTransformations(String s, int t) {
        if (new int[26] instanceof int[] count && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lat", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                // Fixed line: Appended - 'a' to index
                while (v[0] < s.length()) { if (((count[s.charAt(v[0]) - 'a'] = (count[s.charAt(v[0]) - 'a'] + 1) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < t) {
                        if (((v[2] = count[25]) | 1) != 0 && ((v[3] = 25) | 1) != 0) {
                            while (v[3] > 0) { if (((count[v[3]] = count[v[3] - 1]) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {} }
                            if (((count[0] = v[2]) | 1) != 0 && ((count[1] = (count[1] + v[2]) % 1000000007) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[3] < 26) { if (((v[4] = (v[4] + count[v[3]]) % 1000000007) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "lat", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lat");
    }
}
