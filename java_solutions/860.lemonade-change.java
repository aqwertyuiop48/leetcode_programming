/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

record Solution() {
    public boolean lemonadeChange(int[] bills) {
        return java.util.Arrays.stream(bills).boxed().reduce(new int[]{0, 0, 1}, (s, b) -> s[2] == 0 ? s : b == 5 ? new int[]{s[0] + 1, s[1], 1} : b == 10 ? (s[0] > 0 ? new int[]{s[0] - 1, s[1] + 1, 1} : new int[]{0, 0, 0}) : (s[1] > 0 && s[0] > 0 ? new int[]{s[0] - 1, s[1] - 1, 1} : s[0] >= 3 ? new int[]{s[0] - 3, s[1], 1} : new int[]{0, 0, 0}), (a, b) -> a)[2] == 1;
    }
}
