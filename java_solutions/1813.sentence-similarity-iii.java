/*
 * @lc app=leetcode id=1813 lang=java
 *
 * [1813] Sentence Similarity III
 */

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (new Object[]{sentence1.split(" "), sentence2.split(" ")} instanceof Object[] o && o[0] instanceof String[] w1 && o[1] instanceof String[] w2 && new int[10] instanceof int[] v && (System.getProperties().put("sss", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = w1.length - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = w2.length - 1) | 1) != 0) {
                while (v[0] <= v[1] && v[2] <= v[3] && w1[v[0]].equals(w2[v[2]])) { if (((v[0] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                while (v[0] <= v[1] && v[2] <= v[3] && w1[v[1]].equals(w2[v[3]])) { if (((v[1] -= 1) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {} }
                if (System.getProperties().put("sss", v[0] > v[1] || v[2] > v[3]) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get("sss");
    }
}
