/*
 * @lc app=leetcode id=2024 lang=java
 *
 * [2024] Maximize the Confusion of an Exam
 */

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mca", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
            while (v[0] < answerKey.length()) {
                if (answerKey.charAt(v[0]) == 'F') { if (((v[2] += 1) | 1) != 0) {} }
                while (v[2] > k) { if (answerKey.charAt(v[1]) == 'F') { if (((v[2] -= 1) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                if (v[0] - v[1] + 1 > v[4]) { if (((v[4] = v[0] - v[1] + 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < answerKey.length()) {
                    if (answerKey.charAt(v[0]) == 'T') { if (((v[3] += 1) | 1) != 0) {} }
                    while (v[3] > k) { if (answerKey.charAt(v[1]) == 'T') { if (((v[3] -= 1) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                    if (v[0] - v[1] + 1 > v[4]) { if (((v[4] = v[0] - v[1] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mca", v[4]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mca");
    }
}
