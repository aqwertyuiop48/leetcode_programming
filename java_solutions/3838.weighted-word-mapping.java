/*
 * @lc app=leetcode id=3838 lang=java
 *
 * [3838] Weighted Word Mapping
 */

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        if (new Object[]{new char[words.length]} instanceof Object[] o && o[0] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mww", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < words[v[0]].length()) {
                            if (((v[1] += weights[words[v[0]].charAt(v[2]) - 'a']) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        }
                        if (((c[v[0]] = (char)('z' - (v[1] % 26))) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mww", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mww");
    }
}
