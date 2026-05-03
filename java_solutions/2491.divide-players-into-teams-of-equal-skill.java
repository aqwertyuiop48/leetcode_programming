/*
 * @lc app=leetcode id=2491 lang=java
 *
 * [2491] Divide Players Into Teams of Equal Skill
 */

class Solution {
    public long dividePlayers(int[] skill) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "dp", 0L) != null | true) && (skill = java.util.Arrays.stream(skill).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = skill.length - 1) | 1) != 0 && ((v[2] = skill[0] + skill[skill.length - 1]) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
            while (v[0] < v[1] && v[4] == 1) {
                if (skill[(int)v[0]] + skill[(int)v[1]] != v[2]) { if (((v[4] = 0) | 1) != 0 && System.getProperties().put(Thread.currentThread().getId() + "dp", -1L) != null | true) {} }
                else { if (((v[3] += (long)skill[(int)v[0]] * skill[(int)v[1]]) | 1) != 0 && ((v[0] += 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
            }
            if (v[4] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "dp", v[3]) != null | true) {} }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "dp");
    }
}
