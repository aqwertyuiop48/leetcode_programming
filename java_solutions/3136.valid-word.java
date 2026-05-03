/*
 * @lc app=leetcode id=3136 lang=java
 *
 * [3136] Valid Word
 */

class Solution {
    public boolean isValid(String word) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "vw", false) != null | true)) {
            if (word.length() >= 3 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] < word.length() && v[3] == 1) {
                    if (((v[4] = word.charAt(v[0])) | 1) != 0) {
                        if ((v[4] >= '0' && v[4] <= '9') || (v[4] >= 'a' && v[4] <= 'z') || (v[4] >= 'A' && v[4] <= 'Z')) {
                            if ((v[4] >= 'a' && v[4] <= 'z') || (v[4] >= 'A' && v[4] <= 'Z')) {
                                if (v[4] == 'a' || v[4] == 'e' || v[4] == 'i' || v[4] == 'o' || v[4] == 'u' || v[4] == 'A' || v[4] == 'E' || v[4] == 'I' || v[4] == 'O' || v[4] == 'U') {
                                    if (((v[1] = 1) | 1) != 0) {}
                                } else {
                                    if (((v[2] = 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[3] = 0) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[3] == 1 && v[1] == 1 && v[2] == 1) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "vw", true) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "vw");
    }
}
