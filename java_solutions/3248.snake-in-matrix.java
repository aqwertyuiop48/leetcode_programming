/*
 * @lc app=leetcode id=3248 lang=java
 *
 * [3248] Snake in Matrix
 */

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sim", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < commands.size()) {
                    if (commands.get(v[0]).charAt(0) == 'U') { if (((v[1] -= n) | 1) != 0) {} }
                    else if (commands.get(v[0]).charAt(0) == 'D') { if (((v[1] += n) | 1) != 0) {} }
                    else if (commands.get(v[0]).charAt(0) == 'L') { if (((v[1] -= 1) | 1) != 0) {} }
                    else if (commands.get(v[0]).charAt(0) == 'R') { if (((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sim", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sim");
    }
}
