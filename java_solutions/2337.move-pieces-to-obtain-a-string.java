/*
 * @lc app=leetcode id=2337 lang=java
 *
 * [2337] Move Pieces to Obtain a String
 */

class Solution {
    public boolean canChange(String start, String target) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cc", true) != null | true)) {
            if (!start.replace("_", "").equals(target.replace("_", "")) && System.getProperties().put("cc", false) != null | true) {}
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < start.length() && v[1] < target.length()) {
                    while (v[0] < start.length() && start.charAt(v[0]) == '_') { if (((v[0] += 1) | 1) != 0) {} }
                    while (v[1] < target.length() && target.charAt(v[1]) == '_') { if (((v[1] += 1) | 1) != 0) {} }
                    if (v[0] < start.length() && v[1] < target.length()) {
                        if ((start.charAt(v[0]) == 'L' && v[0] < v[1]) || (start.charAt(v[0]) == 'R' && v[0] > v[1])) { if (System.getProperties().put("cc", false) != null | true && ((v[0] = start.length()) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("cc");
    }
}
