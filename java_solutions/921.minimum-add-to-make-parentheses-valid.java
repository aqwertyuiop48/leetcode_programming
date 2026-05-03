/*
 * @lc app=leetcode id=921 lang=java
 *
 * [921] Minimum Add to Make Parentheses Valid
 */

record Solution() {
    public int minAddToMakeValid(String s) {
        return java.util.Arrays.stream(s.chars().boxed().reduce(new int[]{0, 0}, (a, c) -> c == '(' ? new int[]{a[0] + 1, a[1]} : (a[0] > 0 ? new int[]{a[0] - 1, a[1]} : new int[]{a[0], a[1] + 1}), (x, y) -> x)).sum();
    }
}
