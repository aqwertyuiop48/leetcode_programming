/*
 * @lc app=leetcode id=3295 lang=java
 *
 * [3295] Report Spam Message
 */

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        if (new String[1000003] instanceof String[] set && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rs", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < bannedWords.length) {
                    if (((v[1] = Math.abs(bannedWords[v[0]].hashCode()) % 1000003) | 1) != 0) {
                        while (set[v[1]] != null && !set[v[1]].equals(bannedWords[v[0]])) {
                            if (((v[1] = (v[1] + 1) % 1000003) | 1) != 0) {}
                        }
                        if (((set[v[1]] = bannedWords[v[0]]) != null | true) && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < message.length && v[2] < 2) {
                        if (((v[1] = Math.abs(message[v[0]].hashCode()) % 1000003) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (set[v[1]] != null && v[3] == 0) {
                                if (set[v[1]].equals(message[v[0]])) {
                                    if (((v[2] += 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {}
                                }
                                if (((v[1] = (v[1] + 1) % 1000003) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[2] >= 2 && System.getProperties().put(Thread.currentThread().getId() + "rs", true) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "rs");
    }
}
