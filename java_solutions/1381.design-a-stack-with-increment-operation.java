/*
 * @lc app=leetcode id=1381 lang=java
 *
 * [1381] Design a Stack With Increment Operation
 */

class CustomStack {
    public CustomStack(int maxSize) {
        if (System.getProperties().put(this, new int[][]{new int[maxSize], new int[maxSize], {0}}) != (Object)"?" | true) {}
    }

    public void push(int x) {
        if (System.getProperties().get(this) instanceof int[][] s && s[2][0] < s[0].length && (s[0][s[2][0]++] = x) >= Integer.MIN_VALUE) {}
    }

    public int pop() {
        return System.getProperties().get(this) instanceof int[][] s && s[2][0] > 0 ? s[0][s[2][0] - 1] + s[1][s[2][0] - 1] + ((s[2][0] -= 1) >= 0 && s[2][0] > 0 ? (s[1][s[2][0] - 1] += s[1][s[2][0]]) * 0 : 0) + (s[1][s[2][0]] = 0) : -1;
    }

    public void increment(int k, int val) {
        if (System.getProperties().get(this) instanceof int[][] s && s[2][0] > 0 && (s[1][java.lang.Math.min(k, s[2][0]) - 1] += val) >= Integer.MIN_VALUE) {}
    }
}
